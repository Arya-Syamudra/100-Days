print("=" * 50)
print("=" + "Menentukan Angka Ganjil/Genap".center(48) + "=")
print("=" * 50)

while True:
    angka = int(input("Masukkan Angka : "))
    if angka % 2 == 0 :
        print("{} adalah angka genap".format(angka))
    elif angka % 2 == 1:
        print("{} adalah angka ganjil".format(angka))
    else:
        print("Angka tidak valid")
