.class Lcom/digdroid/alman/dig/r2$m0$a$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/r2$m0$a;->onClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/digdroid/alman/dig/r2$m0$a;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/r2$m0$a;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/r2$m0$a$a;->b:Lcom/digdroid/alman/dig/r2$m0$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 3

    iget-object p1, p0, Lcom/digdroid/alman/dig/r2$m0$a$a;->b:Lcom/digdroid/alman/dig/r2$m0$a;

    iget-object p1, p1, Lcom/digdroid/alman/dig/r2$m0$a;->b:Lcom/digdroid/alman/dig/r2$m0;

    iget-object p1, p1, Lcom/digdroid/alman/dig/r2$m0;->d:Lcom/digdroid/alman/dig/r2;

    iget-object p1, p1, Lcom/digdroid/alman/dig/p1;->m0:Lcom/digdroid/alman/dig/p1$a;

    invoke-interface {p1}, Lcom/digdroid/alman/dig/p1$a;->q0()V

    iget-object p1, p0, Lcom/digdroid/alman/dig/r2$m0$a$a;->b:Lcom/digdroid/alman/dig/r2$m0$a;

    iget-object p1, p1, Lcom/digdroid/alman/dig/r2$m0$a;->b:Lcom/digdroid/alman/dig/r2$m0;

    iget-object p1, p1, Lcom/digdroid/alman/dig/r2$m0;->a:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    new-array p1, p1, [I

    :goto_0
    iget-object p1, p0, Lcom/digdroid/alman/dig/r2$m0$a$a;->b:Lcom/digdroid/alman/dig/r2$m0$a;

    iget-object p1, p1, Lcom/digdroid/alman/dig/r2$m0$a;->b:Lcom/digdroid/alman/dig/r2$m0;

    iget-object p1, p1, Lcom/digdroid/alman/dig/r2$m0;->a:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    if-lez p1, :cond_1

    iget-object p1, p0, Lcom/digdroid/alman/dig/r2$m0$a$a;->b:Lcom/digdroid/alman/dig/r2$m0$a;

    iget-object p1, p1, Lcom/digdroid/alman/dig/r2$m0$a;->b:Lcom/digdroid/alman/dig/r2$m0;

    iget-object p1, p1, Lcom/digdroid/alman/dig/r2$m0;->a:Ljava/util/ArrayList;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iget-object v0, p0, Lcom/digdroid/alman/dig/r2$m0$a$a;->b:Lcom/digdroid/alman/dig/r2$m0$a;

    iget-object v0, v0, Lcom/digdroid/alman/dig/r2$m0$a;->b:Lcom/digdroid/alman/dig/r2$m0;

    iget-object v0, v0, Lcom/digdroid/alman/dig/r2$m0;->b:Landroid/database/Cursor;

    invoke-interface {v0}, Landroid/database/Cursor;->getCount()I

    move-result v0

    if-ge p1, v0, :cond_0

    iget-object v0, p0, Lcom/digdroid/alman/dig/r2$m0$a$a;->b:Lcom/digdroid/alman/dig/r2$m0$a;

    iget-object v0, v0, Lcom/digdroid/alman/dig/r2$m0$a;->b:Lcom/digdroid/alman/dig/r2$m0;

    iget-object v0, v0, Lcom/digdroid/alman/dig/r2$m0;->b:Landroid/database/Cursor;

    invoke-interface {v0, p1}, Landroid/database/Cursor;->moveToPosition(I)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/digdroid/alman/dig/r2$m0$a$a;->b:Lcom/digdroid/alman/dig/r2$m0$a;

    iget-object p1, p1, Lcom/digdroid/alman/dig/r2$m0$a;->b:Lcom/digdroid/alman/dig/r2$m0;

    iget-object p1, p1, Lcom/digdroid/alman/dig/r2$m0;->c:Landroid/database/sqlite/SQLiteDatabase;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "DELETE FROM rompaths WHERE _id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/digdroid/alman/dig/r2$m0$a$a;->b:Lcom/digdroid/alman/dig/r2$m0$a;

    iget-object v1, v1, Lcom/digdroid/alman/dig/r2$m0$a;->b:Lcom/digdroid/alman/dig/r2$m0;

    iget-object v1, v1, Lcom/digdroid/alman/dig/r2$m0;->b:Landroid/database/Cursor;

    invoke-interface {v1, p2}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    :cond_0
    iget-object p1, p0, Lcom/digdroid/alman/dig/r2$m0$a$a;->b:Lcom/digdroid/alman/dig/r2$m0$a;

    iget-object p1, p1, Lcom/digdroid/alman/dig/r2$m0$a;->b:Lcom/digdroid/alman/dig/r2$m0;

    iget-object p1, p1, Lcom/digdroid/alman/dig/r2$m0;->a:Ljava/util/ArrayList;

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lcom/digdroid/alman/dig/r2$m0$a$a;->b:Lcom/digdroid/alman/dig/r2$m0$a;

    iget-object p1, p1, Lcom/digdroid/alman/dig/r2$m0$a;->b:Lcom/digdroid/alman/dig/r2$m0;

    iget-object p1, p1, Lcom/digdroid/alman/dig/r2$m0;->b:Landroid/database/Cursor;

    invoke-interface {p1}, Landroid/database/Cursor;->requery()Z

    return-void
.end method
