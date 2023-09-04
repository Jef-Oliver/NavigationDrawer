package com.jeferson.atividade3pdm2.ui.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.jeferson.atividade3pdm2.R;
import com.jeferson.atividade3pdm2.ui.adapters.DisciplinaAdapter;
import com.jeferson.atividade3pdm2.ui.models.Disciplina;

import java.util.ArrayList;
import java.util.List;

public class QuartoPeriodoFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_quarto_periodo, container, false);

        List<Disciplina> disciplinasQuartoPeriodo = new ArrayList<>();
        disciplinasQuartoPeriodo.add(new Disciplina("Projeto de Sistemas", "médio"));
        disciplinasQuartoPeriodo.add(new Disciplina("Infraestrutura Para Sistemas Web", "difícil"));
        disciplinasQuartoPeriodo.add(new Disciplina("Metodologias de Desenvolvimento", "difícil"));
        disciplinasQuartoPeriodo.add(new Disciplina("Internet das coisas", "fácil"));

        RecyclerView recyclerView = view.findViewById(R.id.rv_quarto_periodo);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(new DisciplinaAdapter(disciplinasQuartoPeriodo));

        return view;
    }
}
