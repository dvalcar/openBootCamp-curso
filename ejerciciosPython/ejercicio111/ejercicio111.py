import sqlite3

def insertarAlumno(identificador, nombreAlumno, apellidoAlumno):
    conn=sqlite3.connect('alumnado.db')
    cursor=conn.cursor()
    query = '''INSERT INTO Alumnos(id, nombre, apellido) VALUES (?,?,?)'''
    cursor.execute(query, (identificador, nombreAlumno, apellidoAlumno))
    conn.commit()
    cursor.close()
    conn.close()

def main():
    entrada=''
    id=1
    entrada=input('Alumno:')
    while(entrada!='salir'):

        alumno=entrada.split()
        insertarAlumno(id, alumno[0], alumno[1])
        id+=1
        entrada=input('Alumno:')

if __name__=='__main__':
    main()