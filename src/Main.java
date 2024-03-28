import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {

//        showMenu();
        Doctor myDoctor = new Doctor("Jorge", "Oftalmologo");
        System.out.println(myDoctor.name + " " +myDoctor.speciality);

        Patient patient = new Patient("Alejandra", "alejandra@mail.com");
        patient.setWeight(5);
        System.out.println(patient.getWeight());

        patient.setPhoneNumber("6143534630");
        System.out.println(patient.getPhoneNumber());
    }
}