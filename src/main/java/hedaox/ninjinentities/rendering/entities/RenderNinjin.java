package hedaox.ninjinentities.rendering.entities;

import JinRyuu.JRMCore.entity.RenderDBC;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderNinjin extends RenderDBC {

    public RenderNinjin(ModelBase model, float shadowSize) {
        super(model, shadowSize);
    }

    @Override
    protected ResourceLocation getEntityTexture(Entity entity) {
        try {
            String tex = (String) entity.getClass().getMethod("getTexture").invoke(entity);
            if (tex != null) {
                return new ResourceLocation(tex);
            }
        } catch (Exception ignored) {
        }
        return super.getEntityTexture(entity);
    }
}
