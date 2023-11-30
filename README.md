# week07_www_lab
# www_lab_week1
## I. Yêu cầu bài tập
  Một công ty cần viết một ứng dụng web cho công việc bán hàng của họ. Thông tin cần lưu trữ bao gồm:
- employee (emp_id, full_name, dob, email, phone, address, status)
- product (product_id, name, description, unit, manufacturer_name, status)
- customer (cust_id, cust_name, email, phone, address)
- product_image (product_id, image_id, path, alternative)
- order (order_id, order_date, emp_id, cust_id)
- order_detail (order_id, product_id, quantity, price, note)
- product_price (product_id, price_date_time, price, note)
Diễn giải:
- Một product có nhiều image, một image thuộc về một product. Status chỉ trạng thái kinh doanh
của sản phẩm: 1- đang kinh doanh, 0 - tạm ngưng, -1 - không kinh doanh nữa.
- Employee có status: 1- đang làm việc, 0 - tạm nghỉ, -1 – nghỉ việc.
- Một order có nhiều order_detail, một order_detail thuộc về một order.
- Một order thuộc về một employee, một employeecó nhiều order.
- Một customer có nhiều order, một order chỉ thuộc một customer.
- Một product_detail có một giá (price) được lưu trong product_price. Một giá được xác định
bằng product_id và price_date_time. Tại thời điểm lập order, giá được lấy với price_date_time
gần nhất.
Yêu cầu:
Tạo một dự án sử dụng SpringBoot thực hiện:
- Hiển thị các sản phẩm, chọn vào giỏ hàng và thanh toán (giả lập việc thanh toán qua thẻ nếu có
thể)
- Một trang admin cho phép:
o Các thao tác CRUD cho các đối tượng.
o Thống kê order theo ngày, theo khoảng thời gian.
o Thống kê order theo nhân viên bán hàng trong 1 khoảng thời gian.
## II. Những yêu cầu đã làm được
  ### 1. Ánh xạ CSDL
  ![CSDL](https://github.com/trungthinh2k2/week07_www_lab/assets/89030667/5c2f4b39-1fc4-4a63-ba01-21b3af2113b3)
  ### 2. Lấy danh sách product
 ![ListProduct](https://github.com/trungthinh2k2/week07_www_lab/assets/89030667/c6012f00-124a-4819-85ff-cc405c0bd654)
  ### 3. Xem chi tiết 1 product
  ![ViewDetail](https://github.com/trungthinh2k2/week07_www_lab/assets/89030667/84a73942-e463-4603-a52b-eac7095687f7)
  ### Cập nhật product
  ![Update](https://github.com/trungthinh2k2/week07_www_lab/assets/89030667/99d8c356-2046-4834-b0c2-b47fb20fe224)
## II. Những hạn chế chưa làm được
  ### 1. Chưa tạo được giỏ hàng
  ### 2. Chưa thực hiện được các thao tác thống kê
 
## III. Các công cụ sử dụng
 * IDE: IntelliJ
 * Framework: Spring boot
 * Web server: Tomcat
 * Database server: MySQL
