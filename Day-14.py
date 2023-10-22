x = True

while x == True:
  soal1 = """1. 5 + 5 =
    a. 0
    b. 5
    c. 10
    d. 15"""
  soal2 = """2. 5 - 5 =
    a. 0
    b. 5
    c. 10
    d. 15"""
  
  print(soal1)
  jawaban1 = input("Masukkan jawaban : ")
  print(soal2)
  jawaban2 = input("Masukkan jawaban : ")

  if jawaban1 == "c" and jawaban2 == "a":
    print("Nilai anda 100")
  elif jawaban1 == "c" or jawaban2 == "a":
    print("Nilai anda 50")
  else:
    print("Nilai anda 0") 
    
  lanjut = input("Masih ingin lanjut(y/n)")
  if lanjut == "y":
    x = True
  elif lanjut == "n":
    x = not True
  else:
    print("Tidak valid")