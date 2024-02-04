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
   ```
   dependencies {
    testImplementation platform('org.junit:junit-bom:5.9.1')
    testImplementation 'org.junit.jupiter:junit-jupiter'
    testImplementation group: 'org.junit.jupiter', name: 'junit-jupiter-api', version: '5.10.1'
    testImplementation group: 'org.junit.jupiter', name: 'junit-jupiter-engine', version: '5.10.1'
    testImplementation group: 'org.junit.vintage', name: 'junit-vintage-engine', version: '5.10.1'
    implementation group: 'io.cucumber', name: 'cucumber-java', version: '7.15.0'
    testImplementation group: 'io.cucumber', name: 'cucumber-junit', version: '7.15.0'
    testImplementation group: 'io.rest-assured', name: 'rest-assured', version: '5.4.0'
    implementation group: 'org.json', name: 'json', version: '20231013'
    testImplementation group: 'io.rest-assured', name: 'json-path', version: '5.4.0'
    implementation group: 'io.rest-assured', name: 'json-schema-validator', version: '5.4.0'
    testImplementation group: 'org.assertj', name: 'assertj-core', version: '3.25.2'
    implementation group: 'io.cucumber', name: 'cucumber-jvm', version: '7.15.0', ext: 'pom'}


# Run the Project
Project ini berisikan 4 test case untuk pengujian API dan sebelum dimulai pastikan id user valid. 4 Test case yaitu :
1. Test get list data normal
2. Test create new user normal
3. Test delete user
4. Test update user normal

## How to run
Kita bisa jalankan lewat terminal dengan menggunakan kode :
```
./gradlew apiTest

dan hasilnya akan seperti screenshots berikut
<img width="909" alt="Screenshot 2024-02-04 114719" src="https://github.com/mbahkungedan/java-test-api/assets/119036380/0fb12e7e-1812-4966-ab39-cdba0cfe41fd">
<img width="894" alt="Screenshot 2024-02-04 114738" src="https://github.com/mbahkungedan/java-test-api/assets/119036380/b44b1662-ed3c-459a-9c99-d18b22f61c1e">

Untuk melihat report dari pengujian silahkan periksa di file cucumber-api-report.html di package reports. Buka file dengan browser dan akan tampil seperti berikut :
<img width="943" alt="Screenshot 2024-02-04 115244" src="https://github.com/mbahkungedan/java-test-api/assets/119036380/2a36524f-bf06-4dc5-a149-e38b72f28098">
