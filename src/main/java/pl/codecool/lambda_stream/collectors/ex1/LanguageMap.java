package pl.codecool.lambda_stream.collectors.ex1;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LanguageMap {

    public static void main(String[] args) {

        Stream<Locale> locales = Stream.of(Locale.getAvailableLocales());

        Map<String, Set<String>> countryLanguageSetsLowCode = locales.filter(l -> !l.getDisplayCountry().isEmpty())
                .collect(Collectors.groupingBy(Locale::getDisplayCountry,
                        TreeMap::new,
                        Collectors.mapping(Locale::getDisplayLanguage,
                                Collectors.toSet())));

        locales = Stream.of(Locale.getAvailableLocales());
        Map<String, Set<String>> countryLanguageSets = locales.filter(l -> !l.getDisplayCountry().isEmpty())
                .collect(Collectors.toMap(
                        Locale::getDisplayCountry,
                        l -> Collections.singleton(l.getDisplayLanguage()),
                        (a, b) -> {
                            Set<String> union = new HashSet<>(a);
                            union.addAll(b);
                            return union;
                        }
                ));

        countryLanguageSetsLowCode.entrySet().forEach(System.out::println);
        System.out.println(countryLanguageSets.equals(countryLanguageSetsLowCode));
    }
}
