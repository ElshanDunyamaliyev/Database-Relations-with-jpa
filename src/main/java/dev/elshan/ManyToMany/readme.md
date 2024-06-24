Many to Many de istenilen teref owner ola biler. Owner olmayan terefde mapped by islenir. Owner olan terefde ise JoinTable olur
@JoinTable(name = "teacher_student", joinColumns = @JoinColumn(name = "teacher_id"),inverseJoinColumns = @JoinColumn(name = "student_id"))

Burda yeni table yaranib icerisinde idleri saxlayacaq adi teacher_studentdir. joinColumnsda icerisinde oldugumuz sinifi, inverseJOinColumnsda ise diger sinifi yaziriq
