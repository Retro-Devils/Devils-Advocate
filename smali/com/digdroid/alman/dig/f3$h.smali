.class Lcom/digdroid/alman/dig/f3$h;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/f3;->N3()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/digdroid/alman/dig/f3$t;

.field final synthetic c:Ljava/util/ArrayList;

.field final synthetic d:Landroid/widget/SeekBar;

.field final synthetic e:Lcom/digdroid/alman/dig/f3;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/f3;Lcom/digdroid/alman/dig/f3$t;Ljava/util/ArrayList;Landroid/widget/SeekBar;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/f3$h;->e:Lcom/digdroid/alman/dig/f3;

    iput-object p2, p0, Lcom/digdroid/alman/dig/f3$h;->b:Lcom/digdroid/alman/dig/f3$t;

    iput-object p3, p0, Lcom/digdroid/alman/dig/f3$h;->c:Ljava/util/ArrayList;

    iput-object p4, p0, Lcom/digdroid/alman/dig/f3$h;->d:Landroid/widget/SeekBar;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 6

    new-instance p1, Landroid/content/ContentValues;

    invoke-direct {p1}, Landroid/content/ContentValues;-><init>()V

    iget-object p2, p0, Lcom/digdroid/alman/dig/f3$h;->b:Lcom/digdroid/alman/dig/f3$t;

    invoke-virtual {p2}, Lcom/digdroid/alman/dig/f3$t;->b()I

    move-result p2

    const/4 v0, 0x0

    const/4 v1, 0x1

    const-string v2, "overlay"

    if-nez p2, :cond_0

    invoke-virtual {p1, v2, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_0
    if-ne p2, v1, :cond_1

    const-string p2, "default"

    :goto_0
    invoke-virtual {p1, v2, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    const/4 v3, 0x2

    if-ne p2, v3, :cond_2

    iget-object p2, p0, Lcom/digdroid/alman/dig/f3$h;->b:Lcom/digdroid/alman/dig/f3$t;

    iget-object p2, p2, Lcom/digdroid/alman/dig/f3$t;->f:Ljava/lang/String;

    goto :goto_0

    :cond_2
    iget-object v3, p0, Lcom/digdroid/alman/dig/f3$h;->c:Ljava/util/ArrayList;

    invoke-virtual {v3, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    goto :goto_0

    :goto_1
    iget-object p2, p0, Lcom/digdroid/alman/dig/f3$h;->d:Landroid/widget/SeekBar;

    invoke-virtual {p2}, Landroid/widget/SeekBar;->getProgress()I

    move-result p2

    int-to-float p2, p2

    float-to-double v2, p2

    const-wide/high16 v4, 0x4059000000000000L    # 100.0

    invoke-static {v2, v3}, Ljava/lang/Double;->isNaN(D)Z

    div-double/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p2

    const-string v2, "overlay_opacity"

    invoke-virtual {p1, v2, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Double;)V

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    const-string v1, "user_set_overlay"

    invoke-virtual {p1, v1, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    iget-object p2, p0, Lcom/digdroid/alman/dig/f3$h;->e:Lcom/digdroid/alman/dig/f3;

    iget-object p2, p2, Lcom/digdroid/alman/dig/p1;->a0:Lcom/digdroid/alman/dig/u;

    invoke-virtual {p2}, Lcom/digdroid/alman/dig/u;->c()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object p2

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "slug=\'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/digdroid/alman/dig/f3$h;->e:Lcom/digdroid/alman/dig/f3;

    iget-object v2, v2, Lcom/digdroid/alman/dig/t0;->s0:Lcom/digdroid/alman/dig/h0;

    iget-object v2, v2, Lcom/digdroid/alman/dig/h0;->h:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "\'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "systems"

    invoke-virtual {p2, v2, p1, v1, v0}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    return-void
.end method
