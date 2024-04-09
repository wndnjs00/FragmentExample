package com.example.fragmentexample

import android.os.Bundle
import android.text.TextUtils.replace
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import com.example.fragmentexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

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




}