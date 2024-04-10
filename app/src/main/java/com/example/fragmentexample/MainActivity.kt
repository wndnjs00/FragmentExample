package com.example.fragmentexample

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.fragmentexample.databinding.ActivityMainBinding

// FragmentDataListner 인터페이스 상속받음
class MainActivity : AppCompatActivity(), FragmentDataListener {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // 뷰바인딩 사용
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.apply {
            // Activity -> Fragment로 데이터전달
            fragment1Btn.setOnClickListener{
                val dataToSend = "Activity -> Fragment\n로 데이터전달1"
                val fragment = FirstFragment.newInstance(dataToSend)
                setFragment(fragment)
            }


            fragment2Btn.setOnClickListener {
                // Activity -> Fragment로 데이터전달
                val bundle = Bundle()
                bundle.putString("data", "Activity -> Fragment\n로 데이터전달2")

                val fragment = SecondFragment()
                fragment.arguments = bundle

                setFragment(fragment)
            }
        }

        // MainActivity실행되자마자 나타날 프레그먼트
        setFragment(FirstFragment())
    }

    private fun setFragment(fragment : Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.frameLayout, fragment)
            .commit()
    }


    // secondFragment -> MainActivtiy
    // onDataReceived함수 오버라이딩해서 구현
    override fun onDataReceived(data1 : String){
        // Fragment에서 받은 데이터처리
        Toast.makeText(this, data1 , Toast.LENGTH_SHORT).show()
    }




}