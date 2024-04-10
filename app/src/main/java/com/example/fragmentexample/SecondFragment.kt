package com.example.fragmentexample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fragmentexample.databinding.FragmentFirstBinding
import com.example.fragmentexample.databinding.FragmentSecondBinding

private const val ARG_PARAM1 = "param1"


class SecondFragment : Fragment() {

    private lateinit var binding: FragmentSecondBinding
    private var param1 : String? = null


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