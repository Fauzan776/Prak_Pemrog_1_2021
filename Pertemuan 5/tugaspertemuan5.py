nama = input("Masukkan nama Anda: ")
prodi = input("Masukkan prodi Anda: ")
nilai = input("Masukkan nilai IPK Anda: ")
studi = input("Masukkan lama studi Anda (dalam tahun): ")

nilai = float(nilai)
studi = float(studi)

print("Nama Anda adalah " + nama)
print("Prodi Anda adalah " + prodi)
if (nilai >= 3.51 and nilai <= 4.0) and (studi == 4) :
    print("Selamat! Anda lulus dengan predikat Summa Cumlaude.")
elif (nilai >= 3.51 and nilai <= 4.0) and (studi > 4) :
    print("Selamat! Anda lulus dengan predikat Cumlaude.")
elif (nilai >= 3.01 and nilai < 3.51) and (studi >= 4) :
    print("Selamat! Anda lulus dengan predikat sangat memuaskan.")
elif (nilai >= 2.76 and nilai < 3.01) and (studi >= 4) :
    print("Selama! Anda lulus dengan predikat memuaskan.")
elif (nilai >= 2.00 and nilai < 2.76) and (studi >= 4) :
    print("Selamat! Anda lulus dengan predikat cukup.")
elif (nilai >= 0 and nilai < 2.00) and (studi >= 4) :
    print("Mohon maaf! Anda tidak lulus.")
else :
    print("Nilai tidak valid!")