import random;

lambetzazo = ["Queridos", "Apreciados", "Distinguidos", "Honorables","Estimados", "Respetados" ];
potencialesMarranos = ["compatriotas,","conciudadanos,","amigos,", "coterraneos,", "copatriotas,", "electores,"];
condicion = [" en mi gobierno", "con su apoyo", "siendo elegido", "con su ayuda", "si me siguen", "durante mi mandato"];
compromiso = ["Voy a derrotar", "vencere", "eliminare", "acabare", "luchare contra", "combatire"];
ilusionGuerrerista = [ "la violencia y", "la delincuencia y", "la corrupcion y", "la inflacion y ", "la pobreza y","el desplazamiento y"];
promesa = ["Trabajare por", "garantizare", "protegere", "velare por", "promovere", "defenderé"];
beneficioPopulista = ["la educacion", "el empleo", "la seguridad", "la paz", "la igualdad", "la salud"];
dependiendoLaCantidadDeVotos = ["del pais.","de la ciudad.", "de la comunidad.", "de la poblacion.", "para toda la poblacion.", "de cada colombiano."];

lambetzazo_selecionado = random.choice(lambetzazo);
potencialesMarranos_selecionado = random.choice(potencialesMarranos);
condicion_selecionado = random.choice(condicion);
compromiso_selecionado = random.choice(compromiso);
ilusionGuerrerista_selecionado = random.choice(ilusionGuerrerista);
promesa_selecionado = random.choice(promesa);
beneficioPopulista_selecionado = random.choice(beneficioPopulista);
dependiendoLaCantidadDeVotos_selecionado = random.choice(dependiendoLaCantidadDeVotos);

print("discurso generado: "  + lambetzazo_selecionado + " " + potencialesMarranos_selecionado + " " + condicion_selecionado + " " + compromiso_selecionado + " " 
+ ilusionGuerrerista_selecionado + " " + promesa_selecionado + " " + beneficioPopulista_selecionado + " " + dependiendoLaCantidadDeVotos_selecionado);

print("Discurso generado 2: " + random.choice(lambetzazo) + " " + random.choice(potencialesMarranos) + " " + random.choice(condicion) + " "
 + random.choice(compromiso) + " " + random.choice(ilusionGuerrerista) + " " + random.choice(promesa)+ " " 
+ random.choice(beneficioPopulista) + " " + random.choice(dependiendoLaCantidadDeVotos));