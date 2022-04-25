package circle;

public class HinhTronDemo {
    public static void main(String[] args) {
        ToaDo toaDo = new ToaDo(5,5);
        HinhTron hinhTron = new HinhTron(toaDo, 10.5);


        System.out.println("Hinh Tron co tam O" + " (" + toaDo.getX() +"," + toaDo.getY() + ")"
            + " voi ban kinh " + hinhTron.getBanKinh() + " co dien tich va chu vi lan luot la " +
                hinhTron.tinhDienTich() + " va " + hinhTron.tinhChuVi()
        );



    }




}
