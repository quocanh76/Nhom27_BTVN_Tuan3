# Ứng dụng Chỉnh Sửa Chính Tả

## Mô tả  
Ứng dụng này giúp giáo viên chỉnh sửa chính tả cho học sinh. Học sinh nhập đoạn văn, gửi cho giáo viên và giáo viên có thể chỉnh sửa lại trước khi gửi trả về.  

## Cách hoạt động  
1. **MainActivity (Màn hình chính)**  
   - Học sinh nhập đoạn văn vào ô nhập liệu.  
   - Nhấn nút "NỘP BÀI" để gửi đoạn văn sang `SecondActivity`.  

2. **SecondActivity (Màn hình giáo viên chỉnh sửa)**  
   - Nhận đoạn văn do học sinh gửi.  
   - Giáo viên có thể chỉnh sửa nội dung.  
   - Nhấn nút "ĐÃ SỬA BÀI" để gửi lại đoạn văn đã chỉnh sửa về `MainActivity`.  

## Cấu trúc dự án  
── MainActivity.java # Xử lý nhập liệu và gửi dữ liệu sang màn hình giáo viên │<br>
── SecondActivity.java # Nhận dữ liệu, chỉnh sửa và gửi lại cho MainActivity │<br>
── activity_main.xml # Giao diện màn hình chính (học sinh nhập bài)│<br>
── second_activity.xml # Giao diện màn hình giáo viên chỉnh sửa |<br>

## Cách chạy ứng dụng  
1. Mở dự án trong **Android Studio**.  
2. Kết nối **thiết bị thật** hoặc chạy trên **trình giả lập**.  
3. Nhấn **Run** để chạy ứng dụng.  


## Hình ảnh minh họa  
📷 <br>
<img src = "https://github.com/user-attachments/assets/5a0926e0-5fac-4be1-b6da-461367a30ab4" width ="200"/>
<img src = "https://github.com/user-attachments/assets/2e9b7ab4-de0d-424c-b939-0d421d80c19d" width ="200"/>
<img src = "https://github.com/user-attachments/assets/1f221558-4c21-4dee-8f33-96cd48be9db5" width ="200"/>

<br>

## Tác Giả
Ứng dụng được phát triển bởi:
**Nhóm 27**
<br>
**21200026 - Nguyễn Trường An**
<br>
**21200027 - Hà Quốc Anh**.  

