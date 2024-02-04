# Automation API testing with java

Berikut tugas untuk module 20 PR 18
Project ini untuk pengujian API untuk management user pada tautan https://gorest.co.in/
Project ini dikembangkan menggunakan bahasa pemrograman Java.

# Build With
Project ini membutuhkan beberapa library sebagai berikut :
1. Cucumber
2. Rest Assured
3. Junit
4. Assertion

# Preparation
Sebelum menggunakan project ini, siapkan environment sebagai berikut :
1. JDK diatas versi 8
2. Gradle Wrapper
3. Siapkan Aplikasi IDE (disarankan Intellij IDEA)

# Installation
1. Download repository ini dengan git clone
2. Buka Aplikasi IDE dan impor project yang telah didownload
3. Setting JDK yang sesuai dan tidak lupa menggunakan gradle wrapper untuk gradle distributionnya
4. Setelah terdeploy di IDE dan Build Succesful, buka file build.gradle
5. Periksa di build.gradle apakah depedencies sesuai seperti berikut
   <img width="364" alt="Screenshot 2024-02-04 112439" src="https://github.com/mbahkungedan/java-test-api/assets/119036380/d4e38a59-43c5-4e13-b801-4015bbd6891c">

# Run the Project
Project ini berisikan 4 test case untuk pengujian API dan sebelum dimulai pastikan id user valid. 4 Test case yaitu :
1. Test get list data normal
2. Test create new user normal
3. Test delete user
4. Test update user normal

## How to run
Kita bisa jalankan lewat terminal dengan menggunakan kode :
>./gradlew apiTest




