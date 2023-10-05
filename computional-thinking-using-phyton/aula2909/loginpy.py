# definimos uma lista de listas (com nome e senha)
usuarios = [
    ['alberto', '1234'],
    ['mario', '6282'],
    ['maria', '5274'],
    ['joana', '9943']
]

nome = input('Nome do usuário: ')
senha = input('Senha: ')

# Verificando se a combinação nome e senha está na lista de usuários
usuario_encontrado = [nome, senha] in usuarios

if usuario_encontrado:
    msg = f'Acesso liberado'
else:
    msg = 'Acesso negado'

print(msg)