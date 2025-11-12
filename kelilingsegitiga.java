public class KelilingSegitiga {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Masukkan sisi 1 segitiga: ");
		double sisi1 = input.nextDouble();

		System.out.print("Masukkan sisi  2 segitiga: ");
		double sisi2 = input.nextDouble();

		System.out.print("Masukkan sisi 3 segitiga: ");
		double sisi3 = input.nextDouble();

		double keliling = sisi1 + sisi2 + sisi3;
		System.out.println("Keliling segitiga adalah: " + keliling);
	}
}