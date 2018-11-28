public class ElektroFactory {

    public enum ProductType{
        telewizor_marki_Retro_wisla_3, toster_pneumatyczny, hydrokinetyczna_obieraczka_do_bananow
    }

    private RobotManager manager;

    public ElektroFactory(RobotManager manager) {
        this.manager = manager;
    }

    public String getProduct(ProductType prod){
        switch (prod){
            case telewizor_marki_Retro_wisla_3:
                RobotBase a = manager.getClone("A");
                RobotBase b = manager.getClone("B");
                RobotBase c = manager.getClone("C");
                return a.build()+a.build()+a.build()+b.build()+b.build()+c.build();

            case toster_pneumatyczny:
                return "ABBBAD";

            case hydrokinetyczna_obieraczka_do_bananow:
                return "CDAD";
        }

        return null;
    }
}
