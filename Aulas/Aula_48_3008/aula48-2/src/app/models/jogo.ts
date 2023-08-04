export class Jogo{
  public id!: number;
  public nome!: string;
  public descricao!: string;
  public preco!: number;
  public imagem!: string;
  public site!: string;
  public esta_favoritado!: boolean;

  constructor(id: number, nome: string, descricao: string, preco: number, imagem: string, site: string, esta_favoritado: boolean){
    this.id = id;
    this.nome = nome;
    this.descricao = descricao;
    this.preco = preco;
    this.imagem = imagem;
    this.site = site;
    this.esta_favoritado = this.esta_favoritado;
  }
}
