import type { Metadata } from "next";
import { Inter } from "next/font/google";
import Header from "./Header/page";
import Footer from "./Footer/page";

import '../app/css/estilo.css'

const inter = Inter({ subsets: ["latin"] });

export const metadata: Metadata = {
  title: "Criando rotas com NEXT",
  description: "Aula 15",
};

export default function RootLayout({
  children,
}: Readonly<{
  children: React.ReactNode;
}>) {
  return (
    <html lang="pt-br">
      <body className={inter.className}>
        <Header/>
          {children}
        <Footer/>
      </body>
    </html>
  );
}
