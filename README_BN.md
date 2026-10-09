# Samsung Call Recording Helper — Android Studio Project

এটি Samsung Galaxy / Android 15+ ব্যবহারকারীদের জন্য একটি ছোট Kotlin starter project।

## এই প্রজেক্ট কী করে
- Samsung-এর নিজস্ব Auto call recording সেটিংসের পথ দেখায়।
- রেকর্ডিং খোঁজার পথ দেখায়।
- Android-এর সীমাবদ্ধতা স্পষ্ট করে।

## এই প্রজেক্ট কী করে না
- নিজে থেকে ফোন কল রেকর্ড করে না।
- কলের দুই পাশের অডিও রেকর্ড করার নিশ্চয়তা দেয় না।
- Android বা Samsung-এর অঞ্চলভিত্তিক বিধিনিষেধ বাইপাস করে না।

## Android Studio-তে চালানো
1. Android Studio (সাম্প্রতিক স্থিতিশীল সংস্করণ) ইনস্টল করুন।
2. ZIP ফাইল Extract করুন।
3. Android Studio-তে `SamsungCallRecorderHelper` ফোল্ডারটি Open করুন।
4. Gradle Sync সম্পন্ন হতে দিন।
5. একটি Android SDK Platform 35 ইনস্টল থাকতে হবে।
6. USB debugging চালু করে Samsung ফোন সংযুক্ত করুন, অথবা Emulator নির্বাচন করুন।
7. Run ▶ চাপুন।

## APK তৈরি
Android Studio → Build → Build APK(s)। APK সাধারণত `app/build/outputs/apk/debug/` ফোল্ডারে তৈরি হবে।

## পরবর্তী কাস্টমাইজেশন
আপনার ফোনের সঠিক মডেল নম্বর ও One UI সংস্করণ জানা গেলে Samsung-এর নিজস্ব রেকর্ডিং ফিচার আছে কি না আরও নির্দিষ্টভাবে যাচাই করা যাবে।


## GitHub থেকে APK Build (GitHub Actions)
1. এই প্রজেক্টের সব ফাইল GitHub repository-তে upload করুন; `.github/workflows/build-apk.yml` ফাইলটিও থাকতে হবে।
2. Repository-তে Actions tab খুলুন।
3. `Build Android APK` workflow নির্বাচন করুন এবং `Run workflow` চাপুন, অথবা `main` branch-এ push করুন।
4. Build সফল হলে workflow run খুলে Artifacts থেকে `SamsungCallRecorderHelper-debug-apk` ডাউনলোড করুন।
5. ZIP extract করে `app-debug.apk` ফোনে কপি করে ইনস্টল করুন। Android-এ unknown app install অনুমতি চাইতে পারে।

নোট: GitHub build শুধু APK compile করে। এটি Samsung/Android-এর call-recording restrictions দূর করে না; এই app সেটআপ-সহায়ক, স্বয়ংক্রিয়ভাবে কল অডিও রেকর্ড করে না।
