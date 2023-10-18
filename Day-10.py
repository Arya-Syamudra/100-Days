print("Kalkulator")


while True:
  print("""Menu :
    1. Penjumlahan 
    2. Pengurangan
    3. Perkalian
    4. Pembagian
    5. Modulus
    6. Pangkat
    7. Keluar""")
    
  angka1 = int(input("Masukkan angka pertama : "))
  angka2 = int(input("Masukkan angka kedua : "))
  pilihan = input("Masukkan pilihan anda : ")
  hasil = 0
  
  if pilihan == "1":
    hasil = angka1 + angka2
    print(hasil)
  elif pilihan == "2":
    hasil = angka1 - angka2
    print(hasil)
  elif pilihan == "3":
    hasil = angka1 * angka2
    print(hasil)
  elif pilihan == "4":
    hasil = angka1 / angka2
    print(hasil)
  elif pilihan == "5":
    hasil = angka1 % angka2
    print(hasil)
  elif pilihan == "6":
    hasil = angka1 ** angka2
    print(hasil)
  elif pilihan == "7":
    break
  else:
    print("Pilihan tidak Valid")
