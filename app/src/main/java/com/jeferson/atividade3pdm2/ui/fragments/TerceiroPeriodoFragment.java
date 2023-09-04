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

public class TerceiroPeriodoFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_terceiro_periodo, container, false);

        List<Disciplina> disciplinasTerceiroPeriodo = new ArrayList<>();
        disciplinasTerceiroPeriodo.add(new Disciplina("Programação Para Web Designers", "médio"));
        disciplinasTerceiroPeriodo.add(new Disciplina("Administração de Sistemas Proprietários", "difícil"));
        disciplinasTerceiroPeriodo.add(new Disciplina("Introdução À Programação", "difícil"));
        disciplinasTerceiroPeriodo.add(new Disciplina("Programação Para Web I", "difícil"));

        RecyclerView recyclerView = view.findViewById(R.id.rv_terceiro_periodo);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(new DisciplinaAdapter(disciplinasTerceiroPeriodo));

        return view;
    }
}
