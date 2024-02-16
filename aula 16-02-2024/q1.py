import time
from util import Mapa

class Control(): # A Classe Control Herdando da Classe Mapa
    def __init__(self):
        # Inicializa a classe Pai
        ## seu código aqui


        # maquina de estados
        self.robot_state = 'stop'
        self.state_machine = {
            'forward': self.forward,
            'left': self.left,
            'right': self.right,
            'stop': self.stop,
        }
    
    def forward(self) -> None:
        # Move subtraindo 1 uma linha
        # Atualiza a posição
        pass

    def left(self) -> None:
        # Move subtraindo 1 uma coluna
        # Atualiza a posição
        pass

    def right(self) -> None:
        # Move somando 1 uma coluna
        # Atualiza a posição
        pass
    
    def stop(self) -> None:
        # Não faz nada
        pass

    def control(self) -> None:
        # Verifica se a posição acima está livre, se sim, move para cima.
        # Se não, verifica se a posição à esquerda ou à direita está livre, se sim, move para um dos lados.
        # Pare quando estiver na primeira linha.
        

        # Chamada do método de movimento a partir do dicionário
        # por exemplo.....
        # self.robot_state = 'forward'  # para mudar o estado
        # self.state_machine[self.robot_state]() # para chamar o método correspondente



        # Mostre a grade atual
        
        pass
        
def main():
    # Inicializa a classe Control como control
    # seu código aqui
    
    
    
    #chama o método mostrar
    control.mostrar()

    i = 40
    
    while not control.robot_state == 'stop' and i > 0:
        control.control()
        time.sleep(1)
        i -= 1

if __name__=="__main__":
    main()