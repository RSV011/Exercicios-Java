package aedConteudo6;

import java.util.Scanner;

public class C6EX16 {

	public static void main(String[] args) {
		//Professor, esse exercicio eu fiz antes
		//de pesquisar igual um demente por causa do 17.
		//Eu não vou ter tempo de refazer ele quase todo,
		//vou ter que deixar ele assim para priorizar entregar 
		//os outros. Tenha uma Boa noite/dia/tarde.
		double prova1, prova2, prova3, nota, notaFinal, trabalho;
		int idade, peso1, faltas, peso2;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Insira a sua idade: ");
		idade = teclado.nextInt();
		System.out.print("Insira a sua quantidade de faltas: ");
		faltas = teclado.nextInt();
		System.out.print("Insira a sua nota da primeira prova: ");
		prova1 = teclado.nextDouble();
		System.out.print("Insira a sua nota da segunda prova: ");
		prova2 = teclado.nextDouble();
		System.out.print("Insira a sua nota da terceira prova: ");
		prova3 = teclado.nextDouble();
		System.out.print("Insira a sua nota do trabalho final: ");
		trabalho = teclado.nextDouble();
		if (idade <= 17) {
			peso1 = 1;
			if (faltas < 5) {
				peso2 = 3;
				if (prova1 > prova2 && prova2 > prova3 && prova1 > prova3) {
					nota = (prova1 + prova2) / 2;
					notaFinal = (nota * peso1) + (trabalho * peso2);
					if (notaFinal <= 50) {
						System.out.println("idade: " + idade + " resultado: Reprovado");
					} else if (notaFinal > 50 && notaFinal < 70) {
						System.out.println("idade: " + idade + " resultado: Regular");
					} else if (notaFinal >= 70 && notaFinal < 80) {
						System.out.println("idade: " + idade + " resultado: Bom");
					} else if (notaFinal >= 80 && notaFinal < 90) {
						System.out.println("idade: " + idade + " resultado: Muito Bom");
					} else if (notaFinal > 90) {
						System.out.println("idade: " + idade + " resultado: Exelente");
					} else if (prova1 > prova2 && prova2 < prova3 && prova1 > prova3) {
						nota = (prova1 + prova3) / 2;
						notaFinal = (nota * peso1) + (trabalho * peso2);
						if (notaFinal <= 50) {
							System.out.println("idade: " + idade + " resultado: Reprovado");
						} else if (notaFinal > 50 && notaFinal < 70) {
							System.out.println("idade: " + idade + " resultado: Regular");
						} else if (notaFinal >= 70 && notaFinal < 80) {
							System.out.println("idade: " + idade + " resultado: Bom");
						} else if (notaFinal >= 80 && notaFinal < 90) {
							System.out.println("idade: " + idade + " resultado: Muito Bom");
						} else if (notaFinal > 90) {
							System.out.println("idade: " + idade + " resultado: Exelente");
						}
					} else if (prova1 < prova2 && prova2 > prova3 && prova1 > prova3) {
						nota = (prova2 + prova1) / 2;
						notaFinal = (nota * peso1) + (trabalho * peso2);
						if (notaFinal <= 50) {
							System.out.println("idade: " + idade + " resultado: Reprovado");
						} else if (notaFinal > 50 && notaFinal < 70) {
							System.out.println("idade: " + idade + " resultado: Regular");
						} else if (notaFinal >= 70 && notaFinal < 80) {
							System.out.println("idade: " + idade + " resultado: Bom");
						} else if (notaFinal >= 80 && notaFinal < 90) {
							System.out.println("idade: " + idade + " resultado: Muito Bom");
						} else if (notaFinal > 90) {
							System.out.println("idade: " + idade + " resultado: Exelente");
						}
					} else if (prova1 > prova2 && prova2 > prova3 && prova1 < prova3) {
						nota = (prova2 + prova3) / 2;
						notaFinal = (nota * peso1) + (trabalho * peso2);
						if (notaFinal <= 50) {
							System.out.println("idade: " + idade + " resultado: Reprovado");
						} else if (notaFinal > 50 && notaFinal < 70) {
							System.out.println("idade: " + idade + " resultado: Regular");
						} else if (notaFinal >= 70 && notaFinal < 80) {
							System.out.println("idade: " + idade + " resultado: Bom");
						} else if (notaFinal >= 80 && notaFinal < 90) {
							System.out.println("idade: " + idade + " resultado: Muito Bom");
						} else if (notaFinal > 90) {
							System.out.println("idade: " + idade + " resultado: Exelente");
						}
					} else if (prova1 > prova2 && prova2 < prova3 && prova1 < prova3) {
						nota = (prova3 + prova1) / 2;
						notaFinal = (nota * peso1) + (trabalho * peso2);
						if (notaFinal <= 50) {
							System.out.println("idade: " + idade + " resultado: Reprovado");
						} else if (notaFinal > 50 && notaFinal < 70) {
							System.out.println("idade: " + idade + " resultado: Regular");
						} else if (notaFinal >= 70 && notaFinal < 80) {
							System.out.println("idade: " + idade + " resultado: Bom");
						} else if (notaFinal >= 80 && notaFinal < 90) {
							System.out.println("idade: " + idade + " resultado: Muito Bom");
						} else if (notaFinal > 90) {
							System.out.println("idade: " + idade + " resultado: Exelente");
						}
					} else if (prova1 < prova2 && prova2 < prova3 && prova1 < prova3) {
						nota = (prova3 + prova2) / 2;
						notaFinal = (nota * peso1) + (trabalho * peso2);
						if (notaFinal <= 50) {
							System.out.println("idade: " + idade + " resultado: Reprovado");
						} else if (notaFinal > 50 && notaFinal < 70) {
							System.out.println("idade: " + idade + " resultado: Regular");
						} else if (notaFinal >= 70 && notaFinal < 80) {
							System.out.println("idade: " + idade + " resultado: Bom");
						} else if (notaFinal >= 80 && notaFinal < 90) {
							System.out.println("idade: " + idade + " resultado: Muito Bom");
						} else if (notaFinal > 90) {
							System.out.println("idade: " + idade + " resultado: Exelente");
						}
					}
				} else if (faltas >= 5 && idade <= 10) {
					peso1 = 2;
					if (prova1 > prova2 && prova2 > prova3 && prova1 > prova3) {
						nota = (prova1 + prova2) / 2;
						notaFinal = (nota * peso1) + (trabalho * peso2);
						if (notaFinal <= 50) {
							System.out.println("idade: " + idade + " resultado: Reprovado");
						} else if (notaFinal > 50 && notaFinal < 70) {
							System.out.println("idade: " + idade + " resultado: Regular");
						} else if (notaFinal >= 70 && notaFinal < 80) {
							System.out.println("idade: " + idade + " resultado: Bom");
						} else if (notaFinal >= 80 && notaFinal < 90) {
							System.out.println("idade: " + idade + " resultado: Muito Bom");
						} else if (notaFinal > 90) {
							System.out.println("idade: " + idade + " resultado: Exelente");
						} else if (prova1 > prova2 && prova2 < prova3 && prova1 > prova3) {
							nota = (prova1 + prova3) / 2;
							notaFinal = (nota * peso1) + (trabalho * peso2);
							if (notaFinal <= 50) {
								System.out.println("idade: " + idade + " resultado: Reprovado");
							} else if (notaFinal > 50 && notaFinal < 70) {
								System.out.println("idade: " + idade + " resultado: Regular");
							} else if (notaFinal >= 70 && notaFinal < 80) {
								System.out.println("idade: " + idade + " resultado: Bom");
							} else if (notaFinal >= 80 && notaFinal < 90) {
								System.out.println("idade: " + idade + " resultado: Muito Bom");
							} else if (notaFinal > 90) {
								System.out.println("idade: " + idade + " resultado: Exelente");
							}
						} else if (prova1 < prova2 && prova2 > prova3 && prova1 > prova3) {
							nota = (prova2 + prova1) / 2;
							notaFinal = (nota * peso1) + (trabalho * peso2);
							if (notaFinal <= 50) {
								System.out.println("idade: " + idade + " resultado: Reprovado");
							} else if (notaFinal > 50 && notaFinal < 70) {
								System.out.println("idade: " + idade + " resultado: Regular");
							} else if (notaFinal >= 70 && notaFinal < 80) {
								System.out.println("idade: " + idade + " resultado: Bom");
							} else if (notaFinal >= 80 && notaFinal < 90) {
								System.out.println("idade: " + idade + " resultado: Muito Bom");
							} else if (notaFinal > 90) {
								System.out.println("idade: " + idade + " resultado: Exelente");
							}
						} else if (prova1 > prova2 && prova2 > prova3 && prova1 < prova3) {
							nota = (prova2 + prova3) / 2;
							notaFinal = (nota * peso1) + (trabalho * peso2);
							if (notaFinal <= 50) {
								System.out.println("idade: " + idade + " resultado: Reprovado");
							} else if (notaFinal > 50 && notaFinal < 70) {
								System.out.println("idade: " + idade + " resultado: Regular");
							} else if (notaFinal >= 70 && notaFinal < 80) {
								System.out.println("idade: " + idade + " resultado: Bom");
							} else if (notaFinal >= 80 && notaFinal < 90) {
								System.out.println("idade: " + idade + " resultado: Muito Bom");
							} else if (notaFinal > 90) {
								System.out.println("idade: " + idade + " resultado: Exelente");
							}
						} else if (prova1 > prova2 && prova2 < prova3 && prova1 < prova3) {
							nota = (prova3 + prova1) / 2;
							notaFinal = (nota * peso1) + (trabalho * peso2);
							if (notaFinal <= 50) {
								System.out.println("idade: " + idade + " resultado: Reprovado");
							} else if (notaFinal > 50 && notaFinal < 70) {
								System.out.println("idade: " + idade + " resultado: Regular");
							} else if (notaFinal >= 70 && notaFinal < 80) {
								System.out.println("idade: " + idade + " resultado: Bom");
							} else if (notaFinal >= 80 && notaFinal < 90) {
								System.out.println("idade: " + idade + " resultado: Muito Bom");
							} else if (notaFinal > 90) {
								System.out.println("idade: " + idade + " resultado: Exelente");
							}
						} else if (prova1 < prova2 && prova2 < prova3 && prova1 < prova3) {
							nota = (prova3 + prova2) / 2;
							notaFinal = (nota * peso1) + (trabalho * peso2);
							if (notaFinal <= 50) {
								System.out.println("idade: " + idade + " resultado: Reprovado");
							} else if (notaFinal > 50 && notaFinal < 70) {
								System.out.println("idade: " + idade + " resultado: Regular");
							} else if (notaFinal >= 70 && notaFinal < 80) {
								System.out.println("idade: " + idade + " resultado: Bom");
							} else if (notaFinal >= 80 && notaFinal < 90) {
								System.out.println("idade: " + idade + " resultado: Muito Bom");
							} else if (notaFinal > 90) {
								System.out.println("idade: " + idade + " resultado: Exelente");
							}
						}
					}
				} else if (faltas >= 10) {
					peso1 = 1;
					if (prova1 > prova2 && prova2 > prova3 && prova1 > prova3) {
						nota = (prova1 + prova2) / 2;
						notaFinal = (nota * peso1) + (trabalho * peso2);
						if (notaFinal <= 50) {
							System.out.println("idade: " + idade + " resultado: Reprovado");
						} else if (notaFinal > 50 && notaFinal < 70) {
							System.out.println("idade: " + idade + " resultado: Regular");
						} else if (notaFinal >= 70 && notaFinal < 80) {
							System.out.println("idade: " + idade + " resultado: Bom");
						} else if (notaFinal >= 80 && notaFinal < 90) {
							System.out.println("idade: " + idade + " resultado: Muito Bom");
						} else if (notaFinal > 90) {
							System.out.println("idade: " + idade + " resultado: Exelente");
						} else if (prova1 > prova2 && prova2 < prova3 && prova1 > prova3) {
							nota = (prova1 + prova3) / 2;
							notaFinal = (nota * peso1) + (trabalho * peso2);
							if (notaFinal <= 50) {
								System.out.println("idade: " + idade + " resultado: Reprovado");
							} else if (notaFinal > 50 && notaFinal < 70) {
								System.out.println("idade: " + idade + " resultado: Regular");
							} else if (notaFinal >= 70 && notaFinal < 80) {
								System.out.println("idade: " + idade + " resultado: Bom");
							} else if (notaFinal >= 80 && notaFinal < 90) {
								System.out.println("idade: " + idade + " resultado: Muito Bom");
							} else if (notaFinal > 90) {
								System.out.println("idade: " + idade + " resultado: Exelente");
							}
						} else if (prova1 < prova2 && prova2 > prova3 && prova1 > prova3) {
							nota = (prova2 + prova1) / 2;
							notaFinal = (nota * peso1) + (trabalho * peso2);
							if (notaFinal <= 50) {
								System.out.println("idade: " + idade + " resultado: Reprovado");
							} else if (notaFinal > 50 && notaFinal < 70) {
								System.out.println("idade: " + idade + " resultado: Regular");
							} else if (notaFinal >= 70 && notaFinal < 80) {
								System.out.println("idade: " + idade + " resultado: Bom");
							} else if (notaFinal >= 80 && notaFinal < 90) {
								System.out.println("idade: " + idade + " resultado: Muito Bom");
							} else if (notaFinal > 90) {
								System.out.println("idade: " + idade + " resultado: Exelente");
							}
						} else if (prova1 > prova2 && prova2 > prova3 && prova1 < prova3) {
							nota = (prova2 + prova3) / 2;
							notaFinal = (nota * peso1) + (trabalho * peso2);
							if (notaFinal <= 50) {
								System.out.println("idade: " + idade + " resultado: Reprovado");
							} else if (notaFinal > 50 && notaFinal < 70) {
								System.out.println("idade: " + idade + " resultado: Regular");
							} else if (notaFinal >= 70 && notaFinal < 80) {
								System.out.println("idade: " + idade + " resultado: Bom");
							} else if (notaFinal >= 80 && notaFinal < 90) {
								System.out.println("idade: " + idade + " resultado: Muito Bom");
							} else if (notaFinal > 90) {
								System.out.println("idade: " + idade + " resultado: Exelente");
							}
						} else if (prova1 > prova2 && prova2 < prova3 && prova1 < prova3) {
							nota = (prova3 + prova1) / 2;
							notaFinal = (nota * peso1) + (trabalho * peso2);
							if (notaFinal <= 50) {
								System.out.println("idade: " + idade + " resultado: Reprovado");
							} else if (notaFinal > 50 && notaFinal < 70) {
								System.out.println("idade: " + idade + " resultado: Regular");
							} else if (notaFinal >= 70 && notaFinal < 80) {
								System.out.println("idade: " + idade + " resultado: Bom");
							} else if (notaFinal >= 80 && notaFinal < 90) {
								System.out.println("idade: " + idade + " resultado: Muito Bom");
							} else if (notaFinal > 90) {
								System.out.println("idade: " + idade + " resultado: Exelente");
							}
						} else if (prova1 < prova2 && prova2 < prova3 && prova1 < prova3) {
							nota = (prova3 + prova2) / 2;
							notaFinal = (nota * peso1) + (trabalho * peso2);
							if (notaFinal <= 50) {
								System.out.println("idade: " + idade + " resultado: Reprovado");
							} else if (notaFinal > 50 && notaFinal < 70) {
								System.out.println("idade: " + idade + " resultado: Regular");
							} else if (notaFinal >= 70 && notaFinal < 80) {
								System.out.println("idade: " + idade + " resultado: Bom");
							} else if (notaFinal >= 80 && notaFinal < 90) {
								System.out.println("idade: " + idade + " resultado: Muito Bom");
							} else if (notaFinal > 90) {
								System.out.println("idade: " + idade + " resultado: Exelente");
							}
						}
					}
				}
			} else if (idade >= 18 && idade < 50) {
				peso1 = 2;
				if (faltas < 5) {
					peso2 = 3;
					if (prova1 > prova2 && prova2 > prova3 && prova1 > prova3) {
						nota = (prova1 + prova2) / 2;
						notaFinal = (nota * peso1) + (trabalho * peso2);
						if (notaFinal <= 50) {
							System.out.println("idade: " + idade + " resultado: Reprovado");
						} else if (notaFinal > 50 && notaFinal < 70) {
							System.out.println("idade: " + idade + " resultado: Regular");
						} else if (notaFinal >= 70 && notaFinal < 80) {
							System.out.println("idade: " + idade + " resultado: Bom");
						} else if (notaFinal >= 80 && notaFinal < 90) {
							System.out.println("idade: " + idade + " resultado: Muito Bom");
						} else if (notaFinal > 90) {
							System.out.println("idade: " + idade + " resultado: Exelente");
						} else if (prova1 > prova2 && prova2 < prova3 && prova1 > prova3) {
							nota = (prova1 + prova3) / 2;
							notaFinal = (nota * peso1) + (trabalho * peso2);
							if (notaFinal <= 50) {
								System.out.println("idade: " + idade + " resultado: Reprovado");
							} else if (notaFinal > 50 && notaFinal < 70) {
								System.out.println("idade: " + idade + " resultado: Regular");
							} else if (notaFinal >= 70 && notaFinal < 80) {
								System.out.println("idade: " + idade + " resultado: Bom");
							} else if (notaFinal >= 80 && notaFinal < 90) {
								System.out.println("idade: " + idade + " resultado: Muito Bom");
							} else if (notaFinal > 90) {
								System.out.println("idade: " + idade + " resultado: Exelente");
							}
						} else if (prova1 < prova2 && prova2 > prova3 && prova1 > prova3) {
							nota = (prova2 + prova1) / 2;
							notaFinal = (nota * peso1) + (trabalho * peso2);
							if (notaFinal <= 50) {
								System.out.println("idade: " + idade + " resultado: Reprovado");
							} else if (notaFinal > 50 && notaFinal < 70) {
								System.out.println("idade: " + idade + " resultado: Regular");
							} else if (notaFinal >= 70 && notaFinal < 80) {
								System.out.println("idade: " + idade + " resultado: Bom");
							} else if (notaFinal >= 80 && notaFinal < 90) {
								System.out.println("idade: " + idade + " resultado: Muito Bom");
							} else if (notaFinal > 90) {
								System.out.println("idade: " + idade + " resultado: Exelente");
							}
						} else if (prova1 > prova2 && prova2 > prova3 && prova1 < prova3) {
							nota = (prova2 + prova3) / 2;
							notaFinal = (nota * peso1) + (trabalho * peso2);
							if (notaFinal <= 50) {
								System.out.println("idade: " + idade + " resultado: Reprovado");
							} else if (notaFinal > 50 && notaFinal < 70) {
								System.out.println("idade: " + idade + " resultado: Regular");
							} else if (notaFinal >= 70 && notaFinal < 80) {
								System.out.println("idade: " + idade + " resultado: Bom");
							} else if (notaFinal >= 80 && notaFinal < 90) {
								System.out.println("idade: " + idade + " resultado: Muito Bom");
							} else if (notaFinal > 90) {
								System.out.println("idade: " + idade + " resultado: Exelente");
							}
						} else if (prova1 > prova2 && prova2 < prova3 && prova1 < prova3) {
							nota = (prova3 + prova1) / 2;
							notaFinal = (nota * peso1) + (trabalho * peso2);
							if (notaFinal <= 50) {
								System.out.println("idade: " + idade + " resultado: Reprovado");
							} else if (notaFinal > 50 && notaFinal < 70) {
								System.out.println("idade: " + idade + " resultado: Regular");
							} else if (notaFinal >= 70 && notaFinal < 80) {
								System.out.println("idade: " + idade + " resultado: Bom");
							} else if (notaFinal >= 80 && notaFinal < 90) {
								System.out.println("idade: " + idade + " resultado: Muito Bom");
							} else if (notaFinal > 90) {
								System.out.println("idade: " + idade + " resultado: Exelente");
							}
						} else if (prova1 < prova2 && prova2 < prova3 && prova1 < prova3) {
							nota = (prova3 + prova2) / 2;
							notaFinal = (nota * peso1) + (trabalho * peso2);
							if (notaFinal <= 50) {
								System.out.println("idade: " + idade + " resultado: Reprovado");
							} else if (notaFinal > 50 && notaFinal < 70) {
								System.out.println("idade: " + idade + " resultado: Regular");
							} else if (notaFinal >= 70 && notaFinal < 80) {
								System.out.println("idade: " + idade + " resultado: Bom");
							} else if (notaFinal >= 80 && notaFinal < 90) {
								System.out.println("idade: " + idade + " resultado: Muito Bom");
							} else if (notaFinal > 90) {
								System.out.println("idade: " + idade + " resultado: Exelente");
							}
						}
					} else if (faltas >= 5 && idade <= 10) {
						peso1 = 2;
						if (prova1 > prova2 && prova2 > prova3 && prova1 > prova3) {
							nota = (prova1 + prova2) / 2;
							notaFinal = (nota * peso1) + (trabalho * peso2);
							if (notaFinal <= 50) {
								System.out.println("idade: " + idade + " resultado: Reprovado");
							} else if (notaFinal > 50 && notaFinal < 70) {
								System.out.println("idade: " + idade + " resultado: Regular");
							} else if (notaFinal >= 70 && notaFinal < 80) {
								System.out.println("idade: " + idade + " resultado: Bom");
							} else if (notaFinal >= 80 && notaFinal < 90) {
								System.out.println("idade: " + idade + " resultado: Muito Bom");
							} else if (notaFinal > 90) {
								System.out.println("idade: " + idade + " resultado: Exelente");
							} else if (prova1 > prova2 && prova2 < prova3 && prova1 > prova3) {
								nota = (prova1 + prova3) / 2;
								notaFinal = (nota * peso1) + (trabalho * peso2);
								if (notaFinal <= 50) {
									System.out.println("idade: " + idade + " resultado: Reprovado");
								} else if (notaFinal > 50 && notaFinal < 70) {
									System.out.println("idade: " + idade + " resultado: Regular");
								} else if (notaFinal >= 70 && notaFinal < 80) {
									System.out.println("idade: " + idade + " resultado: Bom");
								} else if (notaFinal >= 80 && notaFinal < 90) {
									System.out.println("idade: " + idade + " resultado: Muito Bom");
								} else if (notaFinal > 90) {
									System.out.println("idade: " + idade + " resultado: Exelente");
								}
							} else if (prova1 < prova2 && prova2 > prova3 && prova1 > prova3) {
								nota = (prova2 + prova1) / 2;
								notaFinal = (nota * peso1) + (trabalho * peso2);
								if (notaFinal <= 50) {
									System.out.println("idade: " + idade + " resultado: Reprovado");
								} else if (notaFinal > 50 && notaFinal < 70) {
									System.out.println("idade: " + idade + " resultado: Regular");
								} else if (notaFinal >= 70 && notaFinal < 80) {
									System.out.println("idade: " + idade + " resultado: Bom");
								} else if (notaFinal >= 80 && notaFinal < 90) {
									System.out.println("idade: " + idade + " resultado: Muito Bom");
								} else if (notaFinal > 90) {
									System.out.println("idade: " + idade + " resultado: Exelente");
								}
							} else if (prova1 > prova2 && prova2 > prova3 && prova1 < prova3) {
								nota = (prova2 + prova3) / 2;
								notaFinal = (nota * peso1) + (trabalho * peso2);
								if (notaFinal <= 50) {
									System.out.println("idade: " + idade + " resultado: Reprovado");
								} else if (notaFinal > 50 && notaFinal < 70) {
									System.out.println("idade: " + idade + " resultado: Regular");
								} else if (notaFinal >= 70 && notaFinal < 80) {
									System.out.println("idade: " + idade + " resultado: Bom");
								} else if (notaFinal >= 80 && notaFinal < 90) {
									System.out.println("idade: " + idade + " resultado: Muito Bom");
								} else if (notaFinal > 90) {
									System.out.println("idade: " + idade + " resultado: Exelente");
								}
							} else if (prova1 > prova2 && prova2 < prova3 && prova1 < prova3) {
								nota = (prova3 + prova1) / 2;
								notaFinal = (nota * peso1) + (trabalho * peso2);
								if (notaFinal <= 50) {
									System.out.println("idade: " + idade + " resultado: Reprovado");
								} else if (notaFinal > 50 && notaFinal < 70) {
									System.out.println("idade: " + idade + " resultado: Regular");
								} else if (notaFinal >= 70 && notaFinal < 80) {
									System.out.println("idade: " + idade + " resultado: Bom");
								} else if (notaFinal >= 80 && notaFinal < 90) {
									System.out.println("idade: " + idade + " resultado: Muito Bom");
								} else if (notaFinal > 90) {
									System.out.println("idade: " + idade + " resultado: Exelente");
								}
							} else if (prova1 < prova2 && prova2 < prova3 && prova1 < prova3) {
								nota = (prova3 + prova2) / 2;
								notaFinal = (nota * peso1) + (trabalho * peso2);
								if (notaFinal <= 50) {
									System.out.println("idade: " + idade + " resultado: Reprovado");
								} else if (notaFinal > 50 && notaFinal < 70) {
									System.out.println("idade: " + idade + " resultado: Regular");
								} else if (notaFinal >= 70 && notaFinal < 80) {
									System.out.println("idade: " + idade + " resultado: Bom");
								} else if (notaFinal >= 80 && notaFinal < 90) {
									System.out.println("idade: " + idade + " resultado: Muito Bom");
								} else if (notaFinal > 90) {
									System.out.println("idade: " + idade + " resultado: Exelente");
								}
							}
						}
					} else if (faltas >= 10) {
						peso1 = 1;
						if (prova1 > prova2 && prova2 > prova3 && prova1 > prova3) {
							nota = (prova1 + prova2) / 2;
							notaFinal = (nota * peso1) + (trabalho * peso2);
							if (notaFinal <= 50) {
								System.out.println("idade: " + idade + " resultado: Reprovado");
							} else if (notaFinal > 50 && notaFinal < 70) {
								System.out.println("idade: " + idade + " resultado: Regular");
							} else if (notaFinal >= 70 && notaFinal < 80) {
								System.out.println("idade: " + idade + " resultado: Bom");
							} else if (notaFinal >= 80 && notaFinal < 90) {
								System.out.println("idade: " + idade + " resultado: Muito Bom");
							} else if (notaFinal > 90) {
								System.out.println("idade: " + idade + " resultado: Exelente");
							} else if (prova1 > prova2 && prova2 < prova3 && prova1 > prova3) {
								nota = (prova1 + prova3) / 2;
								notaFinal = (nota * peso1) + (trabalho * peso2);
								if (notaFinal <= 50) {
									System.out.println("idade: " + idade + " resultado: Reprovado");
								} else if (notaFinal > 50 && notaFinal < 70) {
									System.out.println("idade: " + idade + " resultado: Regular");
								} else if (notaFinal >= 70 && notaFinal < 80) {
									System.out.println("idade: " + idade + " resultado: Bom");
								} else if (notaFinal >= 80 && notaFinal < 90) {
									System.out.println("idade: " + idade + " resultado: Muito Bom");
								} else if (notaFinal > 90) {
									System.out.println("idade: " + idade + " resultado: Exelente");
								}
							} else if (prova1 < prova2 && prova2 > prova3 && prova1 > prova3) {
								nota = (prova2 + prova1) / 2;
								notaFinal = (nota * peso1) + (trabalho * peso2);
								if (notaFinal <= 50) {
									System.out.println("idade: " + idade + " resultado: Reprovado");
								} else if (notaFinal > 50 && notaFinal < 70) {
									System.out.println("idade: " + idade + " resultado: Regular");
								} else if (notaFinal >= 70 && notaFinal < 80) {
									System.out.println("idade: " + idade + " resultado: Bom");
								} else if (notaFinal >= 80 && notaFinal < 90) {
									System.out.println("idade: " + idade + " resultado: Muito Bom");
								} else if (notaFinal > 90) {
									System.out.println("idade: " + idade + " resultado: Exelente");
								}
							} else if (prova1 > prova2 && prova2 > prova3 && prova1 < prova3) {
								nota = (prova2 + prova3) / 2;
								notaFinal = (nota * peso1) + (trabalho * peso2);
								if (notaFinal <= 50) {
									System.out.println("idade: " + idade + " resultado: Reprovado");
								} else if (notaFinal > 50 && notaFinal < 70) {
									System.out.println("idade: " + idade + " resultado: Regular");
								} else if (notaFinal >= 70 && notaFinal < 80) {
									System.out.println("idade: " + idade + " resultado: Bom");
								} else if (notaFinal >= 80 && notaFinal < 90) {
									System.out.println("idade: " + idade + " resultado: Muito Bom");
								} else if (notaFinal > 90) {
									System.out.println("idade: " + idade + " resultado: Exelente");
								}
							} else if (prova1 > prova2 && prova2 < prova3 && prova1 < prova3) {
								nota = (prova3 + prova1) / 2;
								notaFinal = (nota * peso1) + (trabalho * peso2);
								if (notaFinal <= 50) {
									System.out.println("idade: " + idade + " resultado: Reprovado");
								} else if (notaFinal > 50 && notaFinal < 70) {
									System.out.println("idade: " + idade + " resultado: Regular");
								} else if (notaFinal >= 70 && notaFinal < 80) {
									System.out.println("idade: " + idade + " resultado: Bom");
								} else if (notaFinal >= 80 && notaFinal < 90) {
									System.out.println("idade: " + idade + " resultado: Muito Bom");
								} else if (notaFinal > 90) {
									System.out.println("idade: " + idade + " resultado: Exelente");
								}
							} else if (prova1 < prova2 && prova2 < prova3 && prova1 < prova3) {
								nota = (prova3 + prova2) / 2;
								notaFinal = (nota * peso1) + (trabalho * peso2);
								if (notaFinal <= 50) {
									System.out.println("idade: " + idade + " resultado: Reprovado");
								} else if (notaFinal > 50 && notaFinal < 70) {
									System.out.println("idade: " + idade + " resultado: Regular");
								} else if (notaFinal >= 70 && notaFinal < 80) {
									System.out.println("idade: " + idade + " resultado: Bom");
								} else if (notaFinal >= 80 && notaFinal < 90) {
									System.out.println("idade: " + idade + " resultado: Muito Bom");
								} else if (notaFinal > 90) {
									System.out.println("idade: " + idade + " resultado: Exelente");
								}
							}
						}
					}
				}
			} else if (idade > 50) {
				peso1 = 3;
				if (faltas < 5) {
					peso2 = 3;
					if (prova1 > prova2 && prova2 > prova3 && prova1 > prova3) {
						nota = (prova1 + prova2) / 2;
						notaFinal = (nota * peso1) + (trabalho * peso2);
						if (notaFinal <= 50) {
							System.out.println("idade: " + idade + " resultado: Reprovado");
						} else if (notaFinal > 50 && notaFinal < 70) {
							System.out.println("idade: " + idade + " resultado: Regular");
						} else if (notaFinal >= 70 && notaFinal < 80) {
							System.out.println("idade: " + idade + " resultado: Bom");
						} else if (notaFinal >= 80 && notaFinal < 90) {
							System.out.println("idade: " + idade + " resultado: Muito Bom");
						} else if (notaFinal > 90) {
							System.out.println("idade: " + idade + " resultado: Exelente");
						} else if (prova1 > prova2 && prova2 < prova3 && prova1 > prova3) {
							nota = (prova1 + prova3) / 2;
							notaFinal = (nota * peso1) + (trabalho * peso2);
							if (notaFinal <= 50) {
								System.out.println("idade: " + idade + " resultado: Reprovado");
							} else if (notaFinal > 50 && notaFinal < 70) {
								System.out.println("idade: " + idade + " resultado: Regular");
							} else if (notaFinal >= 70 && notaFinal < 80) {
								System.out.println("idade: " + idade + " resultado: Bom");
							} else if (notaFinal >= 80 && notaFinal < 90) {
								System.out.println("idade: " + idade + " resultado: Muito Bom");
							} else if (notaFinal > 90) {
								System.out.println("idade: " + idade + " resultado: Exelente");
							}
						} else if (prova1 < prova2 && prova2 > prova3 && prova1 > prova3) {
							nota = (prova2 + prova1) / 2;
							notaFinal = (nota * peso1) + (trabalho * peso2);
							if (notaFinal <= 50) {
								System.out.println("idade: " + idade + " resultado: Reprovado");
							} else if (notaFinal > 50 && notaFinal < 70) {
								System.out.println("idade: " + idade + " resultado: Regular");
							} else if (notaFinal >= 70 && notaFinal < 80) {
								System.out.println("idade: " + idade + " resultado: Bom");
							} else if (notaFinal >= 80 && notaFinal < 90) {
								System.out.println("idade: " + idade + " resultado: Muito Bom");
							} else if (notaFinal > 90) {
								System.out.println("idade: " + idade + " resultado: Exelente");
							}
						} else if (prova1 > prova2 && prova2 > prova3 && prova1 < prova3) {
							nota = (prova2 + prova3) / 2;
							notaFinal = (nota * peso1) + (trabalho * peso2);
							if (notaFinal <= 50) {
								System.out.println("idade: " + idade + " resultado: Reprovado");
							} else if (notaFinal > 50 && notaFinal < 70) {
								System.out.println("idade: " + idade + " resultado: Regular");
							} else if (notaFinal >= 70 && notaFinal < 80) {
								System.out.println("idade: " + idade + " resultado: Bom");
							} else if (notaFinal >= 80 && notaFinal < 90) {
								System.out.println("idade: " + idade + " resultado: Muito Bom");
							} else if (notaFinal > 90) {
								System.out.println("idade: " + idade + " resultado: Exelente");
							}
						} else if (prova1 > prova2 && prova2 < prova3 && prova1 < prova3) {
							nota = (prova3 + prova1) / 2;
							notaFinal = (nota * peso1) + (trabalho * peso2);
							if (notaFinal <= 50) {
								System.out.println("idade: " + idade + " resultado: Reprovado");
							} else if (notaFinal > 50 && notaFinal < 70) {
								System.out.println("idade: " + idade + " resultado: Regular");
							} else if (notaFinal >= 70 && notaFinal < 80) {
								System.out.println("idade: " + idade + " resultado: Bom");
							} else if (notaFinal >= 80 && notaFinal < 90) {
								System.out.println("idade: " + idade + " resultado: Muito Bom");
							} else if (notaFinal > 90) {
								System.out.println("idade: " + idade + " resultado: Exelente");
							}
						} else if (prova1 < prova2 && prova2 < prova3 && prova1 < prova3) {
							nota = (prova3 + prova2) / 2;
							notaFinal = (nota * peso1) + (trabalho * peso2);
							if (notaFinal <= 50) {
								System.out.println("idade: " + idade + " resultado: Reprovado");
							} else if (notaFinal > 50 && notaFinal < 70) {
								System.out.println("idade: " + idade + " resultado: Regular");
							} else if (notaFinal >= 70 && notaFinal < 80) {
								System.out.println("idade: " + idade + " resultado: Bom");
							} else if (notaFinal >= 80 && notaFinal < 90) {
								System.out.println("idade: " + idade + " resultado: Muito Bom");
							} else if (notaFinal > 90) {
								System.out.println("idade: " + idade + " resultado: Exelente");
							}
						}
					} else if (faltas >= 5 && idade <= 10) {
						peso1 = 2;
						if (prova1 > prova2 && prova2 > prova3 && prova1 > prova3) {
							nota = (prova1 + prova2) / 2;
							notaFinal = (nota * peso1) + (trabalho * peso2);
							if (notaFinal <= 50) {
								System.out.println("idade: " + idade + " resultado: Reprovado");
							} else if (notaFinal > 50 && notaFinal < 70) {
								System.out.println("idade: " + idade + " resultado: Regular");
							} else if (notaFinal >= 70 && notaFinal < 80) {
								System.out.println("idade: " + idade + " resultado: Bom");
							} else if (notaFinal >= 80 && notaFinal < 90) {
								System.out.println("idade: " + idade + " resultado: Muito Bom");
							} else if (notaFinal > 90) {
								System.out.println("idade: " + idade + " resultado: Exelente");
							} else if (prova1 > prova2 && prova2 < prova3 && prova1 > prova3) {
								nota = (prova1 + prova3) / 2;
								notaFinal = (nota * peso1) + (trabalho * peso2);
								if (notaFinal <= 50) {
									System.out.println("idade: " + idade + " resultado: Reprovado");
								} else if (notaFinal > 50 && notaFinal < 70) {
									System.out.println("idade: " + idade + " resultado: Regular");
								} else if (notaFinal >= 70 && notaFinal < 80) {
									System.out.println("idade: " + idade + " resultado: Bom");
								} else if (notaFinal >= 80 && notaFinal < 90) {
									System.out.println("idade: " + idade + " resultado: Muito Bom");
								} else if (notaFinal > 90) {
									System.out.println("idade: " + idade + " resultado: Exelente");
								}
							} else if (prova1 < prova2 && prova2 > prova3 && prova1 > prova3) {
								nota = (prova2 + prova1) / 2;
								notaFinal = (nota * peso1) + (trabalho * peso2);
								if (notaFinal <= 50) {
									System.out.println("idade: " + idade + " resultado: Reprovado");
								} else if (notaFinal > 50 && notaFinal < 70) {
									System.out.println("idade: " + idade + " resultado: Regular");
								} else if (notaFinal >= 70 && notaFinal < 80) {
									System.out.println("idade: " + idade + " resultado: Bom");
								} else if (notaFinal >= 80 && notaFinal < 90) {
									System.out.println("idade: " + idade + " resultado: Muito Bom");
								} else if (notaFinal > 90) {
									System.out.println("idade: " + idade + " resultado: Exelente");
								}
							} else if (prova1 > prova2 && prova2 > prova3 && prova1 < prova3) {
								nota = (prova2 + prova3) / 2;
								notaFinal = (nota * peso1) + (trabalho * peso2);
								if (notaFinal <= 50) {
									System.out.println("idade: " + idade + " resultado: Reprovado");
								} else if (notaFinal > 50 && notaFinal < 70) {
									System.out.println("idade: " + idade + " resultado: Regular");
								} else if (notaFinal >= 70 && notaFinal < 80) {
									System.out.println("idade: " + idade + " resultado: Bom");
								} else if (notaFinal >= 80 && notaFinal < 90) {
									System.out.println("idade: " + idade + " resultado: Muito Bom");
								} else if (notaFinal > 90) {
									System.out.println("idade: " + idade + " resultado: Exelente");
								}
							} else if (prova1 > prova2 && prova2 < prova3 && prova1 < prova3) {
								nota = (prova3 + prova1) / 2;
								notaFinal = (nota * peso1) + (trabalho * peso2);
								if (notaFinal <= 50) {
									System.out.println("idade: " + idade + " resultado: Reprovado");
								} else if (notaFinal > 50 && notaFinal < 70) {
									System.out.println("idade: " + idade + " resultado: Regular");
								} else if (notaFinal >= 70 && notaFinal < 80) {
									System.out.println("idade: " + idade + " resultado: Bom");
								} else if (notaFinal >= 80 && notaFinal < 90) {
									System.out.println("idade: " + idade + " resultado: Muito Bom");
								} else if (notaFinal > 90) {
									System.out.println("idade: " + idade + " resultado: Exelente");
								}
							} else if (prova1 < prova2 && prova2 < prova3 && prova1 < prova3) {
								nota = (prova3 + prova2) / 2;
								notaFinal = (nota * peso1) + (trabalho * peso2);
								if (notaFinal <= 50) {
									System.out.println("idade: " + idade + " resultado: Reprovado");
								} else if (notaFinal > 50 && notaFinal < 70) {
									System.out.println("idade: " + idade + " resultado: Regular");
								} else if (notaFinal >= 70 && notaFinal < 80) {
									System.out.println("idade: " + idade + " resultado: Bom");
								} else if (notaFinal >= 80 && notaFinal < 90) {
									System.out.println("idade: " + idade + " resultado: Muito Bom");
								} else if (notaFinal > 90) {
									System.out.println("idade: " + idade + " resultado: Exelente");
								}
							}
						}
					} else if (faltas >= 10) {
						peso1 = 1;
						if (prova1 > prova2 && prova2 > prova3 && prova1 > prova3) {
							nota = (prova1 + prova2) / 2;
							notaFinal = (nota * peso1) + (trabalho * peso2);
							if (notaFinal <= 50) {
								System.out.println("idade: " + idade + " resultado: Reprovado");
							} else if (notaFinal > 50 && notaFinal < 70) {
								System.out.println("idade: " + idade + " resultado: Regular");
							} else if (notaFinal >= 70 && notaFinal < 80) {
								System.out.println("idade: " + idade + " resultado: Bom");
							} else if (notaFinal >= 80 && notaFinal < 90) {
								System.out.println("idade: " + idade + " resultado: Muito Bom");
							} else if (notaFinal > 90) {
								System.out.println("idade: " + idade + " resultado: Exelente");
							} else if (prova1 > prova2 && prova2 < prova3 && prova1 > prova3) {
								nota = (prova1 + prova3) / 2;
								notaFinal = (nota * peso1) + (trabalho * peso2);
								if (notaFinal <= 50) {
									System.out.println("idade: " + idade + " resultado: Reprovado");
								} else if (notaFinal > 50 && notaFinal < 70) {
									System.out.println("idade: " + idade + " resultado: Regular");
								} else if (notaFinal >= 70 && notaFinal < 80) {
									System.out.println("idade: " + idade + " resultado: Bom");
								} else if (notaFinal >= 80 && notaFinal < 90) {
									System.out.println("idade: " + idade + " resultado: Muito Bom");
								} else if (notaFinal > 90) {
									System.out.println("idade: " + idade + " resultado: Exelente");
								}
							} else if (prova1 < prova2 && prova2 > prova3 && prova1 > prova3) {
								nota = (prova2 + prova1) / 2;
								notaFinal = (nota * peso1) + (trabalho * peso2);
								if (notaFinal <= 50) {
									System.out.println("idade: " + idade + " resultado: Reprovado");
								} else if (notaFinal > 50 && notaFinal < 70) {
									System.out.println("idade: " + idade + " resultado: Regular");
								} else if (notaFinal >= 70 && notaFinal < 80) {
									System.out.println("idade: " + idade + " resultado: Bom");
								} else if (notaFinal >= 80 && notaFinal < 90) {
									System.out.println("idade: " + idade + " resultado: Muito Bom");
								} else if (notaFinal > 90) {
									System.out.println("idade: " + idade + " resultado: Exelente");
								}
							} else if (prova1 > prova2 && prova2 > prova3 && prova1 < prova3) {
								nota = (prova2 + prova3) / 2;
								notaFinal = (nota * peso1) + (trabalho * peso2);
								if (notaFinal <= 50) {
									System.out.println("idade: " + idade + " resultado: Reprovado");
								} else if (notaFinal > 50 && notaFinal < 70) {
									System.out.println("idade: " + idade + " resultado: Regular");
								} else if (notaFinal >= 70 && notaFinal < 80) {
									System.out.println("idade: " + idade + " resultado: Bom");
								} else if (notaFinal >= 80 && notaFinal < 90) {
									System.out.println("idade: " + idade + " resultado: Muito Bom");
								} else if (notaFinal > 90) {
									System.out.println("idade: " + idade + " resultado: Exelente");
								}
							} else if (prova1 > prova2 && prova2 < prova3 && prova1 < prova3) {
								nota = (prova3 + prova1) / 2;
								notaFinal = (nota * peso1) + (trabalho * peso2);
								if (notaFinal <= 50) {
									System.out.println("idade: " + idade + " resultado: Reprovado");
								} else if (notaFinal > 50 && notaFinal < 70) {
									System.out.println("idade: " + idade + " resultado: Regular");
								} else if (notaFinal >= 70 && notaFinal < 80) {
									System.out.println("idade: " + idade + " resultado: Bom");
								} else if (notaFinal >= 80 && notaFinal < 90) {
									System.out.println("idade: " + idade + " resultado: Muito Bom");
								} else if (notaFinal > 90) {
									System.out.println("idade: " + idade + " resultado: Exelente");
								}
							} else if (prova1 < prova2 && prova2 < prova3 && prova1 < prova3) {
								nota = (prova3 + prova2) / 2;
								notaFinal = (nota * peso1) + (trabalho * peso2);
								if (notaFinal <= 50) {
									System.out.println("idade: " + idade + " resultado: Reprovado");
								} else if (notaFinal > 50 && notaFinal < 70) {
									System.out.println("idade: " + idade + " resultado: Regular");
								} else if (notaFinal >= 70 && notaFinal < 80) {
									System.out.println("idade: " + idade + " resultado: Bom");
								} else if (notaFinal >= 80 && notaFinal < 90) {
									System.out.println("idade: " + idade + " resultado: Muito Bom");
								} else if (notaFinal > 90) {
									System.out.println("idade: " + idade + " resultado: Exelente");
								}
							}
						}
					}
				}
			}

		}teclado.close();
	}
}
