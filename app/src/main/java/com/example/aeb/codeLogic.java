package com.example.aeb;

import java.util.Objects;

public class codeLogic {
    public static String codeHandler(String input, String prerequisite){
        String[] first = new String[100];                   //массив "изменяемых" элементов
        String[] second = new String[100];                  //массив "вставляемых" элементов

        int i = 0;
        int start = 0;
        String subs;
        int elemIndex = 0;
        if (input.charAt(input.length() - 1) != '\n') {
            input = input + "\n";
        }

        while (i < input.length()){                         //Идём по строке

            if (input.charAt(i) == '='){                    //Нашли "="
                subs = input.substring(start, i);           //Взяли подстроку до "="
                start = i + 1;                              //Обновили индекс отсчёта для новой подстроки
                first[elemIndex] = subs;                    //Добавили в массив "изменяемых" элементов
            }
            else if (input.charAt(i)  =='\n'){              //Нашли "\n"
                subs = input.substring(start, i);           //Взяли подстроку до "\n"
                if (i + 1 <= input.length()){               //Проверка, чтобы не выскочить за последний индекс строки
                    start = i + 1;                          //Обновили индекс отсчёта для новой подстроки
                }
                second[elemIndex] = subs;                   //Добавили в массив "вставляемых" элементов
                elemIndex++;                                //Сдвинулись на новую пару изменяемый+вставляемый
            }
            i++;                                            //Сдвинулись дальше по строке
        }

//Переход из считывания к выполнению программы
        boolean fl = true;                                  //Булевый указатель для выхода из вайла
        while (fl){
            boolean fl1 = true;                                                         //Была ли замена в строке на данной итерации
            for (int index = 0; index < elemIndex; index++){
                if (prerequisite.indexOf(first[index]) != -1){                          //Появился ли "заменяемый" элемент
                    prerequisite = prerequisite.replace(first[index], second[index]);   //Замена всех "заменяемых"
                    fl1 = false;                                                        //Замена БЫЛА->Из цикла не выходим
                }
            }
            if (fl1){                                                                   //Замен не было, выходим из цикла
                fl = false;
            }
        }
        return prerequisite;
    }
}
