package com.example.samsungcallrecorderhelper

import android.app.Activity
import android.os.Bundle
import android.graphics.Typeface
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import android.widget.ScrollView
import android.widget.TextView
import android.widget.Toast

class MainActivity : Activity() {
    private val dark = 0xFF17212B.toInt()
    private val muted = 0xFF52606D.toInt()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val scroll = ScrollView(this)
        val root = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(dp(22), dp(24), dp(22), dp(28))
            setBackgroundColor(0xFFF5F7FA.toInt())
        }
        scroll.addView(root)
        setContentView(scroll)

        root.addView(text("Call Recording Helper", 26f, dark, true))
        root.addView(space(8))
        root.addView(text(
            "Samsung Galaxy • Android 15+\nএই অ্যাপটি Samsung-এর নিজস্ব কল-রেকর্ডিং সেটিংস খুঁজে পেতে সাহায্য করে।",
            15f, muted, false
        ))
        root.addView(space(18))
        root.addView(card(
            "১. Samsung Phone অ্যাপ খুলুন",
            "Phone → ⋮ (তিন ডট) → Settings → Record calls → Auto record calls"
        ))
        root.addView(space(12))
        root.addView(card(
            "২. Auto record calls চালু করুন",
            "অপশনটি থাকলে চালু করে All calls নির্বাচন করুন। আপনার ফোনে অপশনটি না থাকলে মডেল, One UI সংস্করণ বা অঞ্চল অনুযায়ী ফিচারটি অনুপলব্ধ হতে পারে।"
        ))
        root.addView(space(12))
        root.addView(card(
            "৩. রেকর্ডিং খুঁজুন",
            "Phone → ⋮ → Settings → Record calls → Recorded calls। মেনুর নাম One UI সংস্করণ অনুযায়ী সামান্য আলাদা হতে পারে।"
        ))
        root.addView(space(18))

        root.addView(Button(this).apply {
            text = "আমি সেটিংস পরীক্ষা করেছি"
            setOnClickListener {
                Toast.makeText(
                    this@MainActivity,
                    "Samsung Phone অ্যাপে Record calls অপশনটি আছে কি না যাচাই করুন।",
                    Toast.LENGTH_LONG
                ).show()
            }
        }, matchWrap())

        root.addView(space(16))
        root.addView(text("গুরুত্বপূর্ণ সীমাবদ্ধতা", 18f, dark, true))
        root.addView(space(6))
        root.addView(text(
            "সাধারণ থার্ড-পার্টি Android অ্যাপ নির্ভরযোগ্যভাবে ফোন কলের দুই পাশের অডিও স্বয়ংক্রিয়ভাবে রেকর্ড করতে পারে—এমন নিশ্চয়তা নেই। এই প্রকল্প নিজে থেকে কল রেকর্ড করে না এবং Android/Samsung-এর বিধিনিষেধ এড়িয়ে যায় না।",
            14f, muted, false
        ))
        root.addView(space(12))
        root.addView(text(
            "গোপনীয়তা: কল রেকর্ড করার আগে প্রযোজ্য আইন মেনে চলুন এবং প্রয়োজন হলে অপর পক্ষের সম্মতি নিন।",
            14f, muted, false
        ))
    }

    private fun card(title: String, body: String): LinearLayout =
        LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(dp(16), dp(16), dp(16), dp(16))
            setBackgroundColor(0xFFFFFFFF.toInt())
            elevation = dp(2).toFloat()
            addView(text(title, 17f, dark, true))
            addView(space(8))
            addView(text(body, 14f, muted, false))
        }

    private fun text(value: String, size: Float, color: Int, bold: Boolean): TextView =
        TextView(this).apply {
            text = value
            textSize = size
            setTextColor(color)
            if (bold) setTypeface(typeface, Typeface.BOLD)
            setLineSpacing(dp(3).toFloat(), 1.0f)
        }

    private fun space(heightDp: Int) = android.view.View(this).apply {
        layoutParams = LinearLayout.LayoutParams(1, dp(heightDp))
    }

    private fun dp(value: Int): Int =
        (value * resources.displayMetrics.density).toInt()

    private fun matchWrap() = LinearLayout.LayoutParams(
        ViewGroup.LayoutParams.MATCH_PARENT,
        ViewGroup.LayoutParams.WRAP_CONTENT
    )
}
