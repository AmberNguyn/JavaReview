package circle;

public class HinhTron{
    private ToaDo tam;
    private double banKinh;

    public HinhTron(ToaDo tam, double banKinh) {
        this.tam = tam;
        this.banKinh = banKinh;
    }

    public HinhTron(){}

    public ToaDo getTam() {
        return tam;
    }

    public void setTam(ToaDo tam) {
        this.tam = tam;
    }

    public double getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
    }

    public double tinhChuVi()
    {
        return banKinh * 2 * Math.PI;
    }


    public double tinhDienTich()
    {
        return banKinh * banKinh * Math.PI;
    }






}
