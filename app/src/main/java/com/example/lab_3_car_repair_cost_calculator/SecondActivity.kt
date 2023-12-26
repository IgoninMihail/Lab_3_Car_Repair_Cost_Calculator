package com.example.lab_3_car_repair_cost_calculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.CheckBox
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    private lateinit var fi:TextView
    private lateinit var tvresult:TextView
    private lateinit var none1:CheckBox
    private lateinit var none2:CheckBox
    private lateinit var none3:CheckBox
    private lateinit var none4:CheckBox
    private lateinit var none5:CheckBox
    private lateinit var none6:CheckBox
    private lateinit var none7:CheckBox
    private lateinit var none8:CheckBox
    private lateinit var none9:CheckBox
    private lateinit var none10:CheckBox
    private lateinit var none11:CheckBox
    private lateinit var none12:CheckBox
    private lateinit var none13:CheckBox
    private lateinit var none14:CheckBox
    private lateinit var none15:CheckBox
    private lateinit var none16:CheckBox
    private lateinit var painting1:CheckBox
    private lateinit var painting2:CheckBox
    private lateinit var painting3:CheckBox
    private lateinit var painting4:CheckBox
    private lateinit var painting5:CheckBox
    private lateinit var painting6:CheckBox
    private lateinit var painting7:CheckBox
    private lateinit var painting8:CheckBox
    private lateinit var painting9:CheckBox
    private lateinit var painting10:CheckBox
    private lateinit var painting11:CheckBox
    private lateinit var painting12:CheckBox
    private lateinit var painting13:CheckBox
    private lateinit var painting14:CheckBox
    private lateinit var painting15:CheckBox
    private lateinit var painting16:CheckBox
    private lateinit var small1:CheckBox
    private lateinit var small2:CheckBox
    private lateinit var small3:CheckBox
    private lateinit var small4:CheckBox
    private lateinit var small5:CheckBox
    private lateinit var small6:CheckBox
    private lateinit var small7:CheckBox
    private lateinit var small8:CheckBox
    private lateinit var small9:CheckBox
    private lateinit var small10:CheckBox
    private lateinit var small11:CheckBox
    private lateinit var small12:CheckBox
    private lateinit var small13:CheckBox
    private lateinit var small14:CheckBox
    private lateinit var small15:CheckBox
    private lateinit var small16:CheckBox
    private lateinit var large1:CheckBox
    private lateinit var large2:CheckBox
    private lateinit var large3:CheckBox
    private lateinit var large4:CheckBox
    private lateinit var large5:CheckBox
    private lateinit var large6:CheckBox
    private lateinit var large7:CheckBox
    private lateinit var large8:CheckBox
    private lateinit var large9:CheckBox
    private lateinit var large10:CheckBox
    private lateinit var large11:CheckBox
    private lateinit var large12:CheckBox
    private lateinit var large13:CheckBox
    private lateinit var large14:CheckBox
    private lateinit var large15:CheckBox
    private lateinit var large16:CheckBox
    private lateinit var replace1:CheckBox
    private lateinit var replace2:CheckBox
    private lateinit var replace3:CheckBox
    private lateinit var replace4:CheckBox
    private lateinit var replace5:CheckBox
    private lateinit var replace6:CheckBox
    private lateinit var replace7:CheckBox
    private lateinit var replace8:CheckBox
    private lateinit var replace9:CheckBox
    private lateinit var replace10:CheckBox
    private lateinit var replace11:CheckBox
    private lateinit var replace12:CheckBox
    private lateinit var replace13:CheckBox
    private lateinit var replace14:CheckBox
    private lateinit var replace15:CheckBox
    private lateinit var replace16:CheckBox
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calc)
        fi=findViewById(R.id.fi)
        tvresult=findViewById(R.id.tvresult)
        none1=findViewById(R.id.none1)
        none2=findViewById(R.id.none2)
        none3=findViewById(R.id.none3)
        none4=findViewById(R.id.none4)
        none5=findViewById(R.id.none5)
        none6=findViewById(R.id.none6)
        none7=findViewById(R.id.none7)
        none8=findViewById(R.id.none8)
        none9=findViewById(R.id.none9)
        none10=findViewById(R.id.none10)
        none11=findViewById(R.id.none11)
        none12=findViewById(R.id.none12)
        none13=findViewById(R.id.none13)
        none14=findViewById(R.id.none14)
        none15=findViewById(R.id.none15)
        none16=findViewById(R.id.none16)
        painting1=findViewById(R.id.painting1)
        painting2=findViewById(R.id.painting2)
        painting3=findViewById(R.id.painting3)
        painting4=findViewById(R.id.painting4)
        painting5=findViewById(R.id.painting5)
        painting6=findViewById(R.id.painting6)
        painting7=findViewById(R.id.painting7)
        painting8=findViewById(R.id.painting8)
        painting9=findViewById(R.id.painting9)
        painting10=findViewById(R.id.painting10)
        painting11=findViewById(R.id.painting11)
        painting12=findViewById(R.id.painting12)
        painting13=findViewById(R.id.painting13)
        painting14=findViewById(R.id.painting14)
        painting15=findViewById(R.id.painting15)
        painting16=findViewById(R.id.painting16)
        small1=findViewById(R.id.small1)
        small2=findViewById(R.id.small2)
        small3=findViewById(R.id.small3)
        small4=findViewById(R.id.small4)
        small5=findViewById(R.id.small5)
        small6=findViewById(R.id.small6)
        small7=findViewById(R.id.small7)
        small8=findViewById(R.id.small8)
        small9=findViewById(R.id.small9)
        small10=findViewById(R.id.small10)
        small11=findViewById(R.id.small11)
        small12=findViewById(R.id.small12)
        small13=findViewById(R.id.small13)
        small14=findViewById(R.id.small14)
        small15=findViewById(R.id.small15)
        small16=findViewById(R.id.small16)
        large1=findViewById(R.id.large1)
        large2=findViewById(R.id.large2)
        large3=findViewById(R.id.large3)
        large4=findViewById(R.id.large4)
        large5=findViewById(R.id.large5)
        large6=findViewById(R.id.large6)
        large7=findViewById(R.id.large7)
        large8=findViewById(R.id.large8)
        large9=findViewById(R.id.large9)
        large10=findViewById(R.id.large10)
        large11=findViewById(R.id.large11)
        large12=findViewById(R.id.large12)
        large13=findViewById(R.id.large13)
        large14=findViewById(R.id.large14)
        large15=findViewById(R.id.large15)
        large16=findViewById(R.id.large16)
        replace1=findViewById(R.id.replace1)
        replace2=findViewById(R.id.replace2)
        replace3=findViewById(R.id.replace3)
        replace4=findViewById(R.id.replace4)
        replace5=findViewById(R.id.replace5)
        replace6=findViewById(R.id.replace6)
        replace7=findViewById(R.id.replace7)
        replace8=findViewById(R.id.replace8)
        replace9=findViewById(R.id.replace9)
        replace10=findViewById(R.id.replace10)
        replace11=findViewById(R.id.replace11)
        replace12=findViewById(R.id.replace12)
        replace13=findViewById(R.id.replace13)
        replace14=findViewById(R.id.replace14)
        replace15=findViewById(R.id.replace15)
        replace16=findViewById(R.id.replace16)
        fioEdit()
        //НЕ ПРИДУМАЛ , КАК ПО ДРУГОМУ ЗАПИСАТЬ ПЕРЕМЕННЫЕ.
        var x1 = 0
        var x2 = 0
        var x3 = 0
        var x4 = 0
        var x5 = 0
        var x6 = 0
        var x7 = 0
        var x8 = 0
        var x9 = 0
        var x10 = 0
        var x11 = 0
        var x12 = 0
        var x13 = 0
        var x14 = 0
        var x15 = 0
        var x16 = 0
        var y1 = 0
        var y2 = 0
        var y3 = 0
        var y4 = 0
        var y5 = 0
        var y6 = 0
        var y7 = 0
        var y8 = 0
        var y9 = 0
        var y10 = 0
        var y11 = 0
        var y12 = 0
        var y13 = 0
        var y14 = 0
        var y15 = 0
        var y16 = 0
        var z1 = 0
        var z2 = 0
        var z3 = 0
        var z4 = 0
        var z5 = 0
        var z6 = 0
        var z7 = 0
        var z8 = 0
        var z9 = 0
        var z10 = 0
        var z11 = 0
        var z12 = 0
        var z13 = 0
        var z14 = 0
        var z15 = 0
        var z16 = 0
        fun calc(){
            var a1=x1+y1+z1
            var a2=x2+y2+z2
            var a3=x3+y3+z3
            var a4=x4+y4+z4
            var a5=x5+y5+z5
            var a6=x6+y6+z6
            var a7=x7+y7+z7
            var a8=x8+y8+z8
            var a9=x9+y9+z9
            var a10=x10+y10+z10
            var a11=x11+y11+z11
            var a12=x12+y12+z12
            var a13=x13+y13+z13
            var a14=x14+y14+z14
            var a15=x15+y15+z15
            var a16=x16+y16+z16
            var a = a1+a2+a3+a4+a5+a6+a7+a8+a9+a10+a11+a12+a13+a14+a15+a16
            tvresult.text = "Результат: $a Р"
        }
        calc()
        none1.setOnClickListener{
            if (none1.isChecked){
                painting1.isChecked = false
                small1.isChecked = false
                large1.isChecked = false
                replace1.isChecked = false
                x1 = 0
                y1 = 0
                z1 = 0
                calc()
            }
        }
        painting1.setOnClickListener {
            if(painting1.isChecked){
                none1.isChecked = false
                x1 = 8000
                calc()
            }
            else{
                x1 = 0
                calc()
            }
        }
        small1.setOnClickListener {
            if (small1.isChecked){
                large1.isChecked = false
                none1.isChecked = false
                replace1.isChecked = false
                y1 = 1500
                z1 = 0
                calc()
            }
            else{
                y1 = 0
                calc()
            }
        }
        large1.setOnClickListener {
            if (large1.isChecked){
                small1.isChecked = false
                none1.isChecked = false
                replace1.isChecked = false
                y1 = 6000
                z1 = 0
                calc()
            }
            else{
                y1 = 0
                calc()
            }
        }
        replace1.setOnClickListener {
            if (replace1.isChecked){
                none1.isChecked = false
                small1.isChecked = false
                large1.isChecked = false
                z1 = 25000
                y1 = 0
                calc()
            }
            else{
                z1 = 0
                calc()
            }
        }
        none2.setOnClickListener{
            if (none2.isChecked){
                painting2.isChecked = false
                small2.isChecked = false
                large2.isChecked = false
                replace2.isChecked = false
                x2 = 0
                y2 = 0
                z2 = 0
                calc()
            }
        }
        painting2.setOnClickListener {
            if(painting2.isChecked){
                none2.isChecked = false
                x2 = 6000
                calc()
            }
            else{
                x2 = 0
                calc()
            }
        }
        small2.setOnClickListener {
            if (small2.isChecked){
                large2.isChecked = false
                none2.isChecked = false
                replace2.isChecked = false
                y2 = 1500
                z2 = 0
                calc()
            }
            else{
                y2 = 0
                calc()
            }
        }
        large2.setOnClickListener {
            if (large2.isChecked){
                small2.isChecked = false
                none2.isChecked = false
                replace2.isChecked = false
                y2 = 5000
                z2 = 0
                calc()
            }
            else{
                y2 = 0
                calc()
            }
        }
        replace2.setOnClickListener {
            if (replace2.isChecked){
                none2.isChecked = false
                small2.isChecked = false
                large2.isChecked = false
                z2 = 2000
                y2 = 0
                calc()
            }
            else{
                z2 = 0
                calc()
            }
        }
        none3.setOnClickListener{
            if (none3.isChecked){
                painting3.isChecked = false
                small3.isChecked = false
                large3.isChecked = false
                replace3.isChecked = false
                x3 = 0
                y3 = 0
                z3 = 0
                calc()
            }
        }
        painting3.setOnClickListener {
            if(painting3.isChecked){
                none3.isChecked = false
                x3 = 6000
                calc()
            }
            else{
                x3 = 0
                calc()
            }
        }
        small3.setOnClickListener {
            if (small3.isChecked){
                large3.isChecked = false
                none3.isChecked = false
                replace3.isChecked = false
                y3 = 1500
                z3 = 0
                calc()
            }
            else{
                y3 = 0
                calc()
            }
        }
        large3.setOnClickListener {
            if (large3.isChecked){
                small3.isChecked = false
                none3.isChecked = false
                replace3.isChecked = false
                y3 = 5000
                z3 = 0
                calc()
            }
            else{
                y3 = 0
                calc()
            }
        }
        replace3.setOnClickListener {
            if (replace3.isChecked){
                none3.isChecked = false
                small3.isChecked = false
                large3.isChecked = false
                z3 = 2000
                y3 = 0
                calc()
            }
            else{
                z3 = 0
                calc()
            }
        }
        none4.setOnClickListener{
            if (none4.isChecked){
                painting4.isChecked = false
                small4.isChecked = false
                large4.isChecked = false
                replace4.isChecked = false
                x4 = 0
                y4 = 0
                z4 = 0
                calc()
            }
        }
        painting4.setOnClickListener {
            if(painting4.isChecked){
                none4.isChecked = false
                x4 = 8000
                calc()
            }
            else{
                x4 = 0
                calc()
            }
        }
        small4.setOnClickListener {
            if (small4.isChecked){
                large4.isChecked = false
                none4.isChecked = false
                replace4.isChecked = false
                y4 = 1500
                z4 = 0
                calc()
            }
            else{
                y4 = 0
                calc()
            }
        }
        large4.setOnClickListener {
            if (large4.isChecked){
                small4.isChecked = false
                none4.isChecked = false
                replace4.isChecked = false
                y4 = 5000
                z4 = 0
                calc()
            }
            else{
                y4 = 0
                calc()
            }
        }
        replace4.setOnClickListener {
            if (replace4.isChecked){
                none4.isChecked = false
                small4.isChecked = false
                large4.isChecked = false
                z4 = 3000
                y4 = 0
                calc()
            }
            else{
                z4 = 0
                calc()
            }
        }
        none5.setOnClickListener{
            if (none5.isChecked){
                painting5.isChecked = false
                small5.isChecked = false
                large5.isChecked = false
                replace5.isChecked = false
                x5 = 0
                y5 = 0
                z5 = 0
                calc()
            }
        }
        painting5.setOnClickListener {
            if(painting5.isChecked){
                none5.isChecked = false
                x5 = 5000
                calc()
            }
            else{
                x5 = 0
                calc()
            }
        }
        small5.setOnClickListener {
            if (small5.isChecked){
                large5.isChecked = false
                none5.isChecked = false
                replace5.isChecked = false
                y5 = 1500
                z5 = 0
                calc()
            }
            else{
                y5 = 0
                calc()
            }
        }
        large5.setOnClickListener {
            if (large5.isChecked){
                small5.isChecked = false
                none5.isChecked = false
                replace5.isChecked = false
                y5 = 5000
                z5 = 0
                calc()
            }
            else{
                y5 = 0
                calc()
            }
        }
        replace5.setOnClickListener {
            if (replace5.isChecked){
                none5.isChecked = false
                small5.isChecked = false
                large5.isChecked = false
                z5 = 5500
                y5 = 0
                calc()
            }
            else{
                z5 = 0
                calc()
            }
        }
        none6.setOnClickListener{
            if (none6.isChecked){
                painting6.isChecked = false
                small6.isChecked = false
                large6.isChecked = false
                replace6.isChecked = false
                x6 = 0
                y6 = 0
                z6 = 0
                calc()
            }
        }
        painting6.setOnClickListener {
            if(painting6.isChecked){
                none6.isChecked = false
                x6 = 5000
                calc()
            }
            else{
                x6 = 0
                calc()
            }
        }
        small6.setOnClickListener {
            if (small6.isChecked){
                large6.isChecked = false
                none6.isChecked = false
                replace6.isChecked = false
                y6 = 1500
                z6 = 0
                calc()
            }
            else{
                y6 = 0
                calc()
            }
        }
        large6.setOnClickListener {
            if (large6.isChecked){
                small6.isChecked = false
                none6.isChecked = false
                replace6.isChecked = false
                y6 = 4000
                z6 = 0
                calc()
            }
            else{
                y6 = 0
                calc()
            }
        }
        replace6.setOnClickListener {
            if (replace6.isChecked){
                none6.isChecked = false
                small6.isChecked = false
                large6.isChecked = false
                z6 = 5500
                y6 = 0
                calc()
            }
            else{
                z6 = 0
                calc()
            }
        }
        none7.setOnClickListener{
            if (none7.isChecked){
                painting7.isChecked = false
                small7.isChecked = false
                large7.isChecked = false
                replace7.isChecked = false
                x7 = 0
                y7 = 0
                z7 = 0
                calc()
            }
        }
        painting7.setOnClickListener {
            if(painting7.isChecked){
                none7.isChecked = false
                x7 = 6000
                calc()
            }
            else{
                x7 = 0
                calc()
            }
        }
        small7.setOnClickListener {
            if (small7.isChecked){
                large7.isChecked = false
                none7.isChecked = false
                replace7.isChecked = false
                y7 = 1500
                z7 = 0
                calc()
            }
            else{
                y7 = 0
                calc()
            }
        }
        large7.setOnClickListener {
            if (large7.isChecked){
                small7.isChecked = false
                none7.isChecked = false
                replace7.isChecked = false
                y7 = 5000
                z7 = 0
                calc()
            }
            else{
                y7 = 0
                calc()
            }
        }
        replace7.setOnClickListener {
            if (replace7.isChecked){
                none7.isChecked = false
                small7.isChecked = false
                large7.isChecked = false
                z7 = 15000
                y7 = 0
                calc()
            }
            else{
                z7 = 0
                calc()
            }
        }
        none8.setOnClickListener{
            if (none8.isChecked){
                painting8.isChecked = false
                small8.isChecked = false
                large8.isChecked = false
                replace8.isChecked = false
                x8 = 0
                y8 = 0
                z8 = 0
                calc()
            }
        }
        painting8.setOnClickListener {
            if(painting8.isChecked){
                none8.isChecked = false
                x8 = 6000
                calc()
            }
            else{
                x8 = 0
                calc()
            }
        }
        small8.setOnClickListener {
            if (small8.isChecked){
                large8.isChecked = false
                none8.isChecked = false
                replace8.isChecked = false
                y8 = 1500
                z8 = 0
                calc()
            }
            else{
                y8 = 0
                calc()
            }
        }
        large8.setOnClickListener {
            if (large8.isChecked){
                small8.isChecked = false
                none8.isChecked = false
                replace8.isChecked = false
                y8 = 5000
                z8 = 0
                calc()
            }
            else{
                y8 = 0
                calc()
            }
        }
        replace8.setOnClickListener {
            if (replace8.isChecked){
                none8.isChecked = false
                small8.isChecked = false
                large8.isChecked = false
                z8 = 15000
                y8 = 0
                calc()
            }
            else{
                z8 = 0
                calc()
            }
        }
        none9.setOnClickListener{
            if (none9.isChecked){
                painting9.isChecked = false
                small9.isChecked = false
                large9.isChecked = false
                replace9.isChecked = false
                x9 = 0
                y9 = 0
                z9 = 0
                calc()
            }
        }
        painting9.setOnClickListener {
            if(painting9.isChecked){
                none9.isChecked = false
                x9 = 8000
                calc()
            }
            else{
                x9 = 0
                calc()
            }
        }
        small9.setOnClickListener {
            if (small9.isChecked){
                large9.isChecked = false
                none9.isChecked = false
                replace9.isChecked = false
                y9 = 1500
                z9 = 0
                calc()
            }
            else{
                y9 = 0
                calc()
            }
        }
        large9.setOnClickListener {
            if (large9.isChecked){
                small9.isChecked = false
                none9.isChecked = false
                replace9.isChecked = false
                y9 = 5500
                z9 = 0
                calc()
            }
            else{
                y9 = 0
                calc()
            }
        }
        replace9.setOnClickListener {
            if (replace9.isChecked){
                none9.isChecked = false
                small9.isChecked = false
                large9.isChecked = false
                z9 = 3500
                y9 = 0
                calc()
            }
            else{
                z9 = 0
                calc()
            }
        }
        none10.setOnClickListener{
            if (none10.isChecked){
                painting10.isChecked = false
                small10.isChecked = false
                large10.isChecked = false
                replace10.isChecked = false
                x10 = 0
                y10 = 0
                z10 = 0
                calc()
            }
        }
        painting10.setOnClickListener {
            if(painting10.isChecked){
                none10.isChecked = false
                x10 = 8000
                calc()
            }
            else{
                x10 = 0
                calc()
            }
        }
        small10.setOnClickListener {
            if (small10.isChecked){
                large10.isChecked = false
                none10.isChecked = false
                replace10.isChecked = false
                y10 = 1500
                z10 = 0
                calc()
            }
            else{
                y10 = 0
                calc()
            }
        }
        large10.setOnClickListener {
            if (large10.isChecked){
                small10.isChecked = false
                none10.isChecked = false
                replace10.isChecked = false
                y10 = 5500
                z10 = 0
                calc()
            }
            else{
                y10 = 0
                calc()
            }
        }
        replace10.setOnClickListener {
            if (replace10.isChecked){
                none10.isChecked = false
                small10.isChecked = false
                large10.isChecked = false
                z10 = 3500
                y10 = 0
                calc()
            }
            else{
                z10 = 0
                calc()
            }
        }
        none11.setOnClickListener{
            if (none11.isChecked){
                painting11.isChecked = false
                small11.isChecked = false
                large11.isChecked = false
                replace11.isChecked = false
                x11 = 0
                y11 = 0
                z11 = 0
                calc()
            }
        }
        painting11.setOnClickListener {
            if(painting11.isChecked){
                none11.isChecked = false
                x11 = 8000
                calc()
            }
            else{
                x11 = 0
                calc()
            }
        }
        small11.setOnClickListener {
            if (small11.isChecked){
                large11.isChecked = false
                none11.isChecked = false
                replace11.isChecked = false
                y11 = 1500
                z11 = 0
                calc()
            }
            else{
                y11 = 0
                calc()
            }
        }
        large11.setOnClickListener {
            if (large11.isChecked){
                small11.isChecked = false
                none11.isChecked = false
                replace11.isChecked = false
                y11 = 5500
                z11 = 0
                calc()
            }
            else{
                y11 = 0
                calc()
            }
        }
        replace11.setOnClickListener {
            if (replace11.isChecked){
                none11.isChecked = false
                small11.isChecked = false
                large11.isChecked = false
                z11 = 3500
                y11 = 0
                calc()
            }
            else{
                z11= 0
                calc()
            }
        }
        none12.setOnClickListener{
            if (none12.isChecked){
                painting12.isChecked = false
                small12.isChecked = false
                large12.isChecked = false
                replace12.isChecked = false
                x12 = 0
                y12 = 0
                z12 = 0
                calc()
            }
        }
        painting12.setOnClickListener {
            if(painting12.isChecked){
                none12.isChecked = false
                x12 = 8000
                calc()
            }
            else{
                x12 = 0
                calc()
            }
        }
        small12.setOnClickListener {
            if (small12.isChecked){
                large12.isChecked = false
                none12.isChecked = false
                replace12.isChecked = false
                y12 = 1500
                z12 = 0
                calc()
            }
            else{
                y12 = 0
                calc()
            }
        }
        large12.setOnClickListener {
            if (large12.isChecked){
                small12.isChecked = false
                none12.isChecked = false
                replace12.isChecked = false
                y12 = 5500
                z12 = 0
                calc()
            }
            else{
                y12 = 0
                calc()
            }
        }
        replace12.setOnClickListener {
            if (replace12.isChecked){
                none12.isChecked = false
                small12.isChecked = false
                large12.isChecked = false
                z12 = 3500
                y12 = 0
                calc()
            }
            else{
                z12 = 0
                calc()
            }
        }
        none13.setOnClickListener{
            if (none13.isChecked){
                painting13.isChecked = false
                small13.isChecked = false
                large13.isChecked = false
                replace13.isChecked = false
                x13 = 0
                y13 = 0
                z13 = 0
                calc()
            }
        }
        painting13.setOnClickListener {
            if(painting13.isChecked){
                none13.isChecked = false
                x13 = 6000
                calc()
            }
            else{
                x13 = 0
                calc()
            }
        }
        small13.setOnClickListener {
            if (small13.isChecked){
                large13.isChecked = false
                none13.isChecked = false
                replace13.isChecked = false
                y13 = 1500
                z13 = 0
                calc()
            }
            else{
                y13 = 0
                calc()
            }
        }
        large13.setOnClickListener {
            if (large13.isChecked){
                small13.isChecked = false
                none13.isChecked = false
                replace13.isChecked = false
                y13 = 5500
                z13 = 0
                calc()
            }
            else{
                y13 = 0
                calc()
            }
        }
        replace13.setOnClickListener {
            if (replace13.isChecked){
                none13.isChecked = false
                small13.isChecked = false
                large13.isChecked = false
                z13 = 3500
                y13 = 0
                calc()
            }
            else{
                z13 = 0
                calc()
            }
        }
        none14.setOnClickListener{
            if (none14.isChecked){
                painting14.isChecked = false
                small14.isChecked = false
                large14.isChecked = false
                replace14.isChecked = false
                x14 = 0
                y14 = 0
                z14= 0
                calc()
            }
        }
        painting14.setOnClickListener {
            if(painting14.isChecked){
                none14.isChecked = false
                x14 = 6000
                calc()
            }
            else{
                x14 = 0
                calc()
            }
        }
        small14.setOnClickListener {
            if (small14.isChecked){
                large14.isChecked = false
                none14.isChecked = false
                replace14.isChecked = false
                y14 = 1500
                z14 = 0
                calc()
            }
            else{
                y14 = 0
                calc()
            }
        }
        large14.setOnClickListener {
            if (large14.isChecked){
                small14.isChecked = false
                none14.isChecked = false
                replace14.isChecked = false
                y14 = 5500
                z14 = 0
                calc()
            }
            else{
                y14 = 0
                calc()
            }
        }
        replace14.setOnClickListener {
            if (replace14.isChecked){
                none14.isChecked = false
                small14.isChecked = false
                large14.isChecked = false
                z14 = 3500
                y14 = 0
                calc()
            }
            else{
                z14 = 0
                calc()
            }
        }
        none15.setOnClickListener{
            if (none15.isChecked){
                painting15.isChecked = false
                small15.isChecked = false
                large15.isChecked = false
                replace15.isChecked = false
                x15 = 0
                y15 = 0
                z15 = 0
                calc()
            }
        }
        painting15.setOnClickListener {
            if(painting15.isChecked){
                none15.isChecked = false
                x15 = 9000
                calc()
            }
            else{
                x15 = 0
                calc()
            }
        }
        small15.setOnClickListener {
            if (small15.isChecked){
                large15.isChecked = false
                none15.isChecked = false
                replace15.isChecked = false
                y15 = 1500
                z15 = 0
                calc()
            }
            else{
                y15 = 0
                calc()
            }
        }
        large15.setOnClickListener {
            if (large15.isChecked){
                small15.isChecked = false
                none15.isChecked = false
                replace15.isChecked = false
                y15 = 5500
                z15 = 0
                calc()
            }
            else{
                y15 = 0
                calc()
            }
        }
        replace15.setOnClickListener {
            if (replace15.isChecked){
                none15.isChecked = false
                small15.isChecked = false
                large15.isChecked = false
                z15 = 3000
                y15 = 0
                calc()
            }
            else{
                z15 = 0
                calc()
            }
        }
        none16.setOnClickListener{
            if (none16.isChecked){
                painting16.isChecked = false
                small16.isChecked = false
                large16.isChecked = false
                replace16.isChecked = false
                x16 = 0
                y16 = 0
                z16 = 0
                calc()
            }
        }
        painting16.setOnClickListener {
            if(painting16.isChecked){
                none16.isChecked = false
                x16 = 4500
                calc()
            }
            else{
                x16 = 0
                calc()
            }
        }
        small16.setOnClickListener {
            if (small16.isChecked){
                large16.isChecked = false
                none16.isChecked = false
                replace16.isChecked = false
                y16 = 1500
                z16 = 0
                calc()
            }
            else{
                y16 = 0
                calc()
            }
        }
        large16.setOnClickListener {
            if (large16.isChecked){
                small16.isChecked = false
                none16.isChecked = false
                replace16.isChecked = false
                y16 = 5000
                z16 = 0
                calc()
            }
            else{
                y16 = 0
                calc()
            }
        }
        replace16.setOnClickListener {
            if (replace16.isChecked){
                none16.isChecked = false
                small16.isChecked = false
                large16.isChecked = false
                z16 = 15000
                y16 = 0
                calc()
            }
            else{
                z16 = 0
                calc()
            }
        }
    }

    fun onClick(view: View) {
        val urlIntent = Intent(this, MainActivity::class.java)
        val str2 = tvresult.text.toString()
        urlIntent.putExtra("RESULT", str2)
        startActivity(urlIntent)

    }

    fun fioEdit(){
        val da = intent.getStringExtra("FIO")
        fi.text = da
    }
}