package com.company.baru;


import com.company.baru.creatures.*;
import com.company.baru.exception.MoveException;
import com.company.baru.factory.HerbivorFactory;
import com.company.baru.factory.KarnivorFactory;
import com.company.baru.factory.TumbuhanFactory;
import java.util.*;


/**
 * The main, the wildlings.
 * @author dimassaputra
 */
public class Main extends Thread {
	public static HashMap<Integer, Makhluk> world;
	public static Makhluk dummy;

	public static int num;

	public static void clearScreen() {
		System.out.print("\033[H\033[2J");
		System.out.flush();
	}

	public Main(HashMap<Integer, Makhluk> world) {
		this.world = world;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public void run() {
		Main.world = new HashMap<Integer, Makhluk>();

		/**
		 * Get how big Main.world is.
		 */
		int num = -1;

		while (num < 0) {
			System.out.print("Insert number : ");
			Scanner in = new Scanner(System.in);
			num = in.nextInt();
		}
		Main.num = num;

		/**
		 * Randomize position available.
		 * Based on Main.world size.
		 */
		LinkedList pos = new LinkedList();
		for (int i = 1; i <= num * num; i++) {
			pos.add(i);
		}
		Collections.shuffle(pos);

		/**
		 * Randomize number of all creature.
		 */
		Random random = new Random();
		int jumlahSinga = random.nextInt((num % 6 + 2) + 1);
		int jumlahSerigala = random.nextInt((num % 6 + 2) + 1);
		int jumlahKuda = random.nextInt((num % 6 + 2) + 1);
		int jumlahJerapah = random.nextInt((num % 6 + 2) + 1);
		int jumlahWortel = random.nextInt((num % 6 + 2) + 1);
		int jumlahRumput = random.nextInt((num % 6 + 2) + 1);

		/**
		 * Prepare the factory.
		 */
		KarnivorFactory karnivorFactory = new KarnivorFactory();
		HerbivorFactory herbivorFactory = new HerbivorFactory();
		TumbuhanFactory tumbuhanFactory = new TumbuhanFactory();
		Makhluk dummy = new Singa(0, 0, -1);
		for (int i = 0; i < num * num; i++) {
			Main.world.put(i, dummy);
		}
		/**
		 * Build all creature,
		 * PosisiX obtained from Linkedlist pos.
		 * arahgerak obtained by random.nextint.
		 */
		Makhluk[] lion = new Singa[jumlahSinga];
		int x;
		for (int count = 0; count < jumlahSinga; count++) {
			System.out.println("lion no " + count);
			lion[count] = karnivorFactory.getKarnivor("singa", (int) pos.getFirst(), random.nextInt((4 - 1) + 1) + 1, 1);
			assert (lion[count].getPosisiX() <= num * num);
			pos.removeFirst();
		}

		Makhluk[] wolf = new Serigala[jumlahSerigala];
		for (int count = 0; count < jumlahSerigala; count++) {
			System.out.println("wolf no " + count);
			wolf[count] = karnivorFactory.getKarnivor("serigala", (int) pos.getFirst(), random.nextInt((4 - 1) + 1) + 1, 1);
			assert (wolf[count].getPosisiX() <= num * num);
			pos.removeFirst();
		}

		Makhluk[] horse = new Kuda[jumlahKuda];
		for (int count = 0; count < jumlahKuda; count++) {
			System.out.println("horse no " + count);
			horse[count] = herbivorFactory.getHerbivor("kuda", (int) pos.getFirst(), random.nextInt((4 - 1) + 1) + 1, 1);
			assert (horse[count].getPosisiX() <= num * num);
			pos.removeFirst();
		}

		Makhluk[] giraffe = new Jerapah[jumlahJerapah];
		for (int count = 0; count < jumlahJerapah; count++) {
			System.out.println("Giraffe no " + count);
			giraffe[count] = herbivorFactory.getHerbivor("jerapah", (int) pos.getFirst(), random.nextInt((4 - 1) + 1) + 1, 1);
			assert (giraffe[count].getPosisiX() <= num * num);
			pos.removeFirst();
		}

		Makhluk[] grass = new Rumput[jumlahRumput];
		for (int count = 0; count < jumlahRumput; count++) {
			System.out.println("Grass no " + count);
			grass[count] = tumbuhanFactory.getTumbuhan("rumput", (int) pos.getFirst(), 1);
			assert (grass[count].getPosisiX() <= num * num);
			pos.removeFirst();
		}

		Makhluk[] carrot = new Wortel[jumlahWortel];
		for (int count = 0; count < jumlahWortel; count++) {
			System.out.println("Carrot no " + count);
			carrot[count] = tumbuhanFactory.getTumbuhan("wortel", (int) pos.getFirst(), 1);
			assert (carrot[count].getPosisiX() <= num * num);
			pos.removeFirst();
		}


		/**
		 * Putting creature to Main.world.
		 */


		for (int i = 0; i < jumlahSinga; i++) {
			Main.world.put(lion[i].getPosisiX(), lion[i]);
		}

		for (int i = 0; i < jumlahSerigala; i++) {
			Main.world.put(wolf[i].getPosisiX(), wolf[i]);
		}

		for (int i = 0; i < jumlahKuda; i++) {
			Main.world.put(horse[i].getPosisiX(), horse[i]);
		}

		for (int i = 0; i < jumlahJerapah; i++) {
			Main.world.put(giraffe[i].getPosisiX(), giraffe[i]);
		}

		for (int i = 0; i < jumlahRumput; i++) {
			Main.world.put(grass[i].getPosisiX(), grass[i]);
		}

		for (int i = 0; i < jumlahWortel; i++) {
			Main.world.put(carrot[i].getPosisiX(), carrot[i]);
		}

		for (int i = 0; i < 12; ++i) {
			for (int k = 0; k < num * num; k++) {
				if ((k == num * 2 || k == num * 3 || k == num * 4 || k == num * 5 || k == num * 6 || k == num * 7 || k == num * 8 || k == num || k == num * 9 || k == num * 10 || k == num * 11 || k == num * 12 || k == num * 13 || k == num * 14 || k == num * 15 || k == num * 16 || k == num * 17 || k == num * 18 || k == num * 19 || k == num * 20 || k == num * 21 || k == num * 22 || k == num * 23) && k % num == 0) {
					System.out.println();
					if (world.get(k).getId() == -1 || world.get(k).getUsia() <= 0) {
						world.get(k).destruct();
						System.out.print('*');
					} else if (world.get(k).getId() != -1 && world.get(k).getPower() == 10 && world.get(k).getUsia() > 0) {
						System.out.print(world.get(k).getRep());
						try {
							((Singa) world.get(k)).move(num);
						} catch (MoveException e) {
							//e.toString();
						}
						((Singa) world.get(k)).setUsia(1);
						world.put(world.get(k).getPosisiX(), world.get(k));
						world.put(k, dummy);

					} else if (world.get(k).getPower() == 9 && world.get(k).getUsia() > 0) {
						System.out.print(world.get(k).getRep());
						try {
							((Serigala) world.get(k)).move(num);
						} catch (MoveException e) {
							//e.toString();
						}
						((Serigala) world.get(k)).setUsia(1);
						world.put(world.get(k).getPosisiX(), world.get(k));
						world.put(k, dummy);
					} else if (world.get(k).getPower() == 8 && world.get(k).getUsia() > 0) {
						System.out.print(world.get(k).getRep());
						try {
							((Jerapah) world.get(k)).move(num);
						} catch (MoveException e) {
							e.toString();
						}
						((Jerapah) world.get(k)).setUsia(1);
						world.put(world.get(k).getPosisiX(), world.get(k));
						world.put(k, dummy);
					} else if (world.get(k).getPower() == 7 && world.get(k).getUsia() > 0) {
						System.out.print(world.get(k).getRep());
						//world.get(k).move
						try {
							((Kuda) world.get(k)).move(num);
						} catch (MoveException e) {
							e.toString();
						}
						((Kuda) world.get(k)).setUsia(1);
						world.put(world.get(k).getPosisiX(), world.get(k));
						world.put(k, dummy);
					} else if (world.get(k).getPower() == 6 && world.get(k).getUsia() > 0) {
						System.out.print(world.get(k).getRep());
						((Rumput) world.get(k)).setUsia(1);
					} else if (world.get(k).getPower() == 5 && world.get(k).getUsia() > 0) {
						System.out.print(world.get(k).getRep());
						((Wortel) world.get(k)).setUsia(1);
					}


				} else {
					if (world.get(k).getId() == -1 || world.get(k).getUsia() <= 0) {
						world.get(k).destruct();
						System.out.print('*');
					} else if (world.get(k).getId() != -1 && world.get(k).getPower() == 10 && world.get(k).getUsia() <= 0) {
						System.out.print(world.get(k).getRep());
						try {
							((Singa) world.get(k)).move(num);
						} catch (MoveException e) {
							e.toString();
						}
						((Singa) world.get(k)).setUsia(1);
						world.put(world.get(k).getPosisiX(), world.get(k));
						world.put(k, dummy);

					} else if (world.get(k).getPower() == 9 && world.get(k).getUsia() > 0) {
						System.out.print(world.get(k).getRep());
						try {
							((Serigala) world.get(k)).move(num);
						} catch (MoveException e) {
							e.toString();
						}
						((Serigala) world.get(k)).setUsia(1);
						world.put(world.get(k).getPosisiX(), world.get(k));
						world.put(k, dummy);
					} else if (world.get(k).getPower() == 8 && world.get(k).getUsia() > 0) {
						System.out.print(world.get(k).getRep());
						try {
							((Jerapah) world.get(k)).move(num);
						} catch (MoveException e) {
							e.toString();
						}
						((Jerapah) world.get(k)).setUsia(1);
						world.put(world.get(k).getPosisiX(), world.get(k));
						world.put(k, dummy);
					} else if (world.get(k).getPower() == 7 && world.get(k).getUsia() > 0) {
						System.out.print(world.get(k).getRep());
						//world.get(k).move
						try {
							((Kuda) world.get(k)).move(num);
						} catch (MoveException e) {
							e.toString();
						}
						((Kuda) world.get(k)).setUsia(1);
						world.put(world.get(k).getPosisiX(), world.get(k));
						world.put(k, dummy);
					} else if (world.get(k).getPower() == 6 && world.get(k).getUsia() > 0) {
						System.out.print(world.get(k).getRep());
						((Rumput) world.get(k)).setUsia(1);
					} else if (world.get(k).getPower() == 5 && world.get(k).getUsia() > 0) {
						System.out.print(world.get(k).getRep());
						((Wortel) world.get(k)).setUsia(1);
					}
				}
			}
			System.out.println();
			System.out.println("========================================");
			System.out.println("===============LIMITER==================");
			System.out.println("========================================");
			System.out.print("\033[H\033[2J");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			//} catch(InterruptedException ex) {
			//	Thread.currentThread().interrupt();
			//}
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}


	public static void main(String[] args) {
		/**
		 * Main.world representation.
		 */

		Main thread = new Main(world);
		thread.start();

	}
}

