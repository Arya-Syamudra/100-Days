print("Kalkulator Penugasan") 
 
while True:
  print("""Menu :
   1. Penambahan
   2. Pengurangan
   3. Pengalian
   4. Pembagian
   5. Pembagian Bulat
   6. Pemangkatan
   7. Sisa Bagi
   8. Keluar""")
    
  angka = int(input("Masukkan angka : "))
  pilihan = input("Masukkan pilihan anda : ")
  
  if pilihan == "1":
    angka += angka
    print(angka)
  elif pilihan == "2":
    angka -= angka
    print(angka)
  elif pilihan == "3":
    angka *= angka
    print(angka)
  elif pilihan == "4":
    angka /= angka1
    print(angka)
  elif pilihan == "5":
    angka //= angka
    print(angka)
  elif pilihan == "6":
    angka **= angka
    print(angka) 
  elif pilihan == "7":
    angka %= angka
    print(angka)
  elif pilihan == "8":
    break
  else:
    print("Pilihan tidak Valid")