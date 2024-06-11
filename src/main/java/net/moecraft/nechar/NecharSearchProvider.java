package net.moecraft.nechar;

import codechicken.nei.SearchField;
import codechicken.nei.api.ItemFilter;
import net.minecraft.util.EnumChatFormatting;

public class NecharSearchProvider implements SearchField.ISearchParserProvider {

    @Override
    public ItemFilter getFilter(String searchText) {
        return new NecharSearchFilter(searchText);
    }

    @Override
    public char getPrefix() {
        return '*';
    }

    @Override
    public EnumChatFormatting getHighlightedColor() {
        return EnumChatFormatting.BLUE;
    }

    @Override
    public SearchField.SearchMode getSearchMode() {
        return SearchField.SearchMode.ALWAYS;
    }
}
