package com.capsteam.util;

import java.io.FileReader;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.supercsv.cellprocessor.Optional;
import org.supercsv.cellprocessor.ParseDouble;
import org.supercsv.cellprocessor.ParseInt;
import org.supercsv.cellprocessor.Token;
import org.supercsv.cellprocessor.ift.CellProcessor;
import org.supercsv.io.ICsvBeanReader;
import org.supercsv.io.CsvBeanReader;
import org.supercsv.prefs.CsvPreference;

import com.capsteam.dao.GameDao;
import com.capsteam.model.GameModel;

@Service
public class CsvParse{

	@Autowired
	GameDao juegoDao;
	

	public void cargar(){

		String fileName = "./src/main/resources/vgsales.csv";

		ICsvBeanReader beanReader = null;

		try {

			beanReader = new CsvBeanReader(new FileReader(fileName), CsvPreference.STANDARD_PREFERENCE);

			final String[] header = beanReader.getHeader(true);

			final CellProcessor[] processors = getProcessors();

			GameModel juego;

			while ((juego = beanReader.read(GameModel.class, header, processors)) != null) {

				System.out.println(juego.getId());

				System.out.println("---- " + juego);

				juegoDao.save(juego);

				System.out.println("-----------");

			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			if (beanReader != null) {

				try {
					beanReader.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

		}

	}

	private static CellProcessor[] getProcessors() {

		return new CellProcessor[] {

				new ParseInt(),

				new Optional(),

				new Optional(),

				new Token("N/A", 0, new ParseInt()),

				new Optional(),

				new Optional(),

				new ParseDouble(),

				new ParseDouble(),

				new ParseDouble(),

				new ParseDouble(),

				new ParseDouble(),

		};

	}

}
