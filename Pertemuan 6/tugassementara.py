print(".: Program Siakad :.")
print("1. Tambah Data")
print("2. Edit Data")
print("3. Hapus Data")
print("4. Lihat Data")
menu = input("Menu yang Anda pilih = ")
print('---------------------------')
menu = int(menu)

if menu == 1:
    print("Tambah Data: ")
    print("1. Tambah Data Mahasiswa")
    print("2. Tambah Data Mata kuliah")
    print("3. Kembali")
    menuLagi = input("Menu yang Anda pilih = ")
    menuLagi = int(menuLagi)

    if menuLagi == 1 :
        nama = input("Masukan nama mahasiswa = ")
        print("Mahasiswa yang Anda tambah adalah atas nama " + nama)
    elif menuLagi == 2 :
        matkul = input("Masukan nama mata kuliah = ")
        print("Mata kuliah yang Anda tambah adalah " + matkul)
    elif menuLagi == 3 :
        print("Terimakasih")
    else :
        print("Menu tidak ada")
        
elif (menu >= 2 and menu <=4) :
    print("Fitur belum ada")
else :
    print("Fitur tidak ada")
