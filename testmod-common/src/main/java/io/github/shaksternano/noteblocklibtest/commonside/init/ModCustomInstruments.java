package io.github.shaksternano.noteblocklibtest.commonside.init;

import io.github.shaksternano.noteblocklib.commonside.CustomInstrument;
import io.github.shaksternano.noteblocklibtest.commonside.NoteBlockLibTest;
import net.minecraft.sound.SoundEvents;

public class ModCustomInstruments {

    public static final CustomInstrument CAT_INSTRUMENT = new CustomInstrument(NoteBlockLibTest.MOD_ID, "cat", () -> SoundEvents.ENTITY_CAT_AMBIENT);
    public static final CustomInstrument WOLF_INSTRUMENT = new CustomInstrument(NoteBlockLibTest.MOD_ID, "wolf", () -> SoundEvents.ENTITY_WOLF_AMBIENT);
    public static final CustomInstrument CAT_INSTRUMENT_DUPLICATE = new CustomInstrument(NoteBlockLibTest.MOD_ID, "cat", () -> SoundEvents.ENTITY_CAT_AMBIENT);
}
