package com.dio.poo;

public class Curso extends Conteudo {

    private Integer cargaHoraria;

    @Override
    public double calcularXP() {
        return XP_PADRAO* cargaHoraria;
    }

    public Curso() {
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descrição='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}
