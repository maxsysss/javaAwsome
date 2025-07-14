#Main.py
class ItemDeBiblioteca:
    '''
    def __init__(self, titulo):
        self.titulo=titulo
        
    def exibir(self):
        print(f"Item: {self.titulo}")
    '''
    def exibir(self):
        pass
    
#class Livro:
class Livro(ItemDeBiblioteca):
    #def __init__(self, titulo, autor, ano):
    def __init__(self, titulo, autor):
    #def __init__(self, titulo):
        #super().__init__(titulo)
        self.titulo = titulo
        self.autor = autor
        #self.ano = ano
        #self.emprestado=False
        #self.__emprestimos=0
        
    def exibir(self)    :
        print(f"Livro: {self.titulo} - Autor: {self.autor}")
    
    def emprestar(self):
        '''
        if not self.emprestado:
            self.emprestado = True
            return f"'{self.titulo}' agora está emprestado."
        return f"'{self.titulo}' já está emprestado."
        '''
        self.__emprestimos+=1
        return f"'{self.titulo}' foi emprestado {self.__emprestimos} vez(es)."
        
    def vezes_emprestados(self):
        return self.__emprestimos
        
    def devolver(self):
        if self.emprestado:
            self.emprestado = False
            return f"'{self.titulo}' foi devolvido."
        return f"'{self.titulo}' não estava emprestado."
        
class DVD(ItemDeBiblioteca):
    def __init__(self, titulo, duracao):
        #super().__init__(titulo)
        #self.duracao=duracao
        self.titulo = titulo
        self.duracao = duracao
        
    def exibir(self):
        print(f"DVD: {self.titulo} - Duração: {self.duracao} min")
        
def main():
    def mostrar_item(item):
        item.exibir()
    
    #l=Livro("Cem Anos de Solidão", "Gabriel Garcia Márquez", 1967)
    #l2=Livro("Dom Casmurro", "Machado de Assis")
    l3=Livro("1984", "George Orwell")
    dvd=DVD("Matrix", 136)
    '''
    print(l.emprestar())
    print(l.emprestar())
    print(l.devolver())
    '''
    #print(l2.emprestar())
    #print(l2.emprestar())
    #print(f"O livro foi emprestado {l2.vezes_emprestados()} vez(es).")
    
    #l3.exibir()
    #dvd.exibir()
    mostrar_item(l3)
    mostrar_item(dvd)

main()
