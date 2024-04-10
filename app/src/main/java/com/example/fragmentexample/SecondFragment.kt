package com.example.fragmentexample

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.fragmentexample.databinding.FragmentSecondBinding

private const val ARG_PARAM1 = "param1"


class SecondFragment : Fragment() {

    private lateinit var binding: FragmentSecondBinding
    private var param1 : String? = null

    // listner에 인터페이스(FragmentDataListener) 선언
    private var listener : FragmentDataListener? = null



    override fun onAttach(context: Context) {
        super.onAttach(context)

        // context에 FragmentDataListner가 구현되어있는지 체크(상속받았는지 체크)
        if (context is FragmentDataListener) {
            // context를 listener에 할당
            listener = context
        }else{
            Toast.makeText(context,"$context must implement FragmentDataListener", Toast.LENGTH_SHORT).show()
        }
    }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        // FirstFragment에서 보낸 데이터를 꺼내서 param1에 넣어줌
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
        }
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSecondBinding.inflate(inflater, container, false)

        // MainActivity에서 보낸 데이터 받아오기
        val data = arguments?.getString("data")
        binding.Fragment2.text = data

        binding.Fragment2.text = param1


        binding.btnSendActivity.setOnClickListener {
            // listner를 통해 데이터전달
            val dataToSend = "Fragment -> Activity"
            listener?.onDataReceived(dataToSend)
        }


        return binding.root
    }


    companion object{

        // param1에 FirstFragment에서 전달한 데이터가 들어있음
        // 얘를 arguments에 저장
        fun newInstance(param1 : String) =
            SecondFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                }
            }
    }


}