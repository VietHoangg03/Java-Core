//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ToaDo td1 = new ToaDo(5,5);
        ToaDo td2 = new ToaDo(8,7);
        ToaDo td3 = new ToaDo(9,12);

       // Hinh h = new Hinh(td1); => Khong ton tai lop truu tuong
        //Thuc hien qua cac lop con
        Hinh h1 = new Diem(td1);
        Hinh h2 = new HinhTron(td2,10);
        Hinh h3 = new HinhChuNhat(td3,5,10);

        //Phuong thuc abstract thuc hien o tat ca cac lop con
        System.out.println("Dien tinh 1: "+h1.tinhDienTich());
        System.out.println("Dien tinh 2: "+h2.tinhDienTich());
        System.out.println("Dien tinh 3: "+h3.tinhDienTich());

    }
}