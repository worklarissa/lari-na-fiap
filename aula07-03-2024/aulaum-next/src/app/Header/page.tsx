import Link from "next/link";

const Header = () =>{
    return(
        <>
            <header>
                <h1>Header</h1>
                <nav>
                    <ul>
                        <li>
                            <Link href="/Produtos">Produtos</Link>
                        </li>
                        <li>
                            <Link href="/Contato">Contato</Link>
                        </li>
                        <li>
                            <Link href="/Footer">Rodapé</Link>
                        </li>
                        <li>
                            <Link href="/">Home</Link>
                        </li>
                    </ul>
                </nav>
            </header>
        </>
    )
}

export default Header;