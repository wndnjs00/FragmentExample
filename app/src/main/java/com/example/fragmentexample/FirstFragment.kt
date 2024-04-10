package com.example.fragmentexample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fragmentexample.databinding.FragmentFirstBinding

private const val ARG_PARAM1 = "param1"

class FirstFragment : Fragment() {

    private lateinit var binding: FragmentFirstBinding
    private var param1 : String? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // MainActivity에서 보낸 데이터를 꺼내서 param1에 넣어줌
        // arguments가 null이 아닐때만 실행
        // arguments안에 bundle이라는 객체로 받아온데이터가 들어있는데
        arguments?.let {
            // param1에 bundle을 사용해서 받아온 데이터를 넣어줌
            param1 = it.getString(ARG_PARAM1)
        }


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentFirstBinding.inflate(inflater, container, false)


        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // text와 받아온데이터인 param1을 연결
        binding.Fragment1.text = param1


        // Fragment -> Fragment 데이터전달
        binding.btnGofrag2.setOnClickListener {
            val dataToSend = "FirstFragment -> SecondFragment\n로 데이터전달"
            val fragment2 = SecondFragment.newInstance(dataToSend)

            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.frameLayout, fragment2)
                .commit()
        }

    }


    companion object{
        fun newInstance(param1 : String) =
            FirstFragment().apply {
                // param1에 MainActivity에서 전달한 데이터가 들어있음
                // 얘를 arguments에 저장
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                }
            }
    }


}