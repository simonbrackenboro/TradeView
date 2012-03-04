package com.company.client;

import com.google.gwt.editor.client.Editor;
import com.sencha.gxt.core.client.ValueProvider;
import com.sencha.gxt.data.shared.ModelKeyProvider;
import com.sencha.gxt.data.shared.PropertyAccess;

import java.util.Date;

public interface TradeProperties extends PropertyAccess<Trade> {
    @Editor.Path("tradeName")
    ModelKeyProvider<Trade> key();

    ValueProvider<Trade, String> tradeName();

    ValueProvider<Trade, Double> im();

    ValueProvider<Trade, Date> date();
}