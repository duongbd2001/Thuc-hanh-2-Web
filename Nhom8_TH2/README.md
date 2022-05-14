Thành viên :
Đỗ Thị Xuân Quỳnh _ B19DCCN544

Bùi Đức Dương _ B19DCCN145

Hoàng Hiền Trang _ B19DCCN682

Công việc : add,edit,delete,view

Trang làm add

Quỳnh Làm edit

Dương view,delete

Mô tả web:

+Đầu tiên sẽ hiện ra trang home và ấn vào View Product

+Trang view.html hiện ra với các dữ liệu trong database

+Add:  nhập các thông số vào các ô và ấn save

+edit: nhập các thông số vào các ô cần thay đổi ấn save

+delete: chọn sản phẩm cần xóa và chọn yes để xóa , no để không xóa

Mô tả cách làm:

+Dùng spring data jpa để thao tác với database

+Controler là để tiếp nhận các request và chuyển các cái yêu cầu cho service xử lý

+Service sẽ chứa các xử lý logic để  xử lý các yêu cầu từ controller và nó giao tiếp với database dựa vào đối tượng của lớp productRepository

