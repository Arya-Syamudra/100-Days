print("Kalkulator Perbandingan")


while True:
  print("""Menu :
    1. Sama Dengan / Tidak Sama Dengan 
    2. Lebih Besar / Lebih Kecil
    3. Lebih Besar Sama Dengan / Lebih Kecil Sama Dengan
    4. Keluar""")
    
  angka1 = int(input("Masukkan angka pertama : "))
  angka2 = int(input("Masukkan angka kedua : "))
  pilihan = input("Masukkan pilihan anda : ")
  
  if pilihan == "1":
    if angka1 == angka2:
      print("{} sama dengan {}".format(angka1, angka2))
    elif angka1 != angka2:
      print("{} tidak sama dengan {}".format(angka1, angka2))
    else:
      print("Hasil tidak diketahui")
  elif pilihan == "2":
    if angka1 > angka2:
      print("{} Lebih besar dari {}".format(angka1, angka2))
    elif angka1 != angka2:
      print("{} sama kecil dari {}".format(angka1, angka2))
    else:
      print("Hasil tidak diketahui")
  elif pilihan == "3":
    if angka1 > angka2:
      print("{} Lebih besar dari atau sama dengan {}".format(angka1, angka2))
    elif angka1 != angka2:
      print("{} sama kecil dari atau sama dengan {}".format(angka1, angka2))
    else:
      print("Hasil tidak diketahui")
  elif pilihan == "4":
    break
  else:
    print("Pilihan tidak Valid")