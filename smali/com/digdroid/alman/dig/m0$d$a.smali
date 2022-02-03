.class Lcom/digdroid/alman/dig/m0$d$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/m0$d;->onClick(Landroid/content/DialogInterface;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:I

.field final synthetic c:Lcom/digdroid/alman/dig/m0$d;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/m0$d;I)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/m0$d$a;->c:Lcom/digdroid/alman/dig/m0$d;

    iput p2, p0, Lcom/digdroid/alman/dig/m0$d$a;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 3

    iget-object p1, p0, Lcom/digdroid/alman/dig/m0$d$a;->c:Lcom/digdroid/alman/dig/m0$d;

    iget-object p1, p1, Lcom/digdroid/alman/dig/m0$d;->c:Lcom/digdroid/alman/dig/m0;

    iget-object p1, p1, Lcom/digdroid/alman/dig/m0;->c:Landroid/database/sqlite/SQLiteDatabase;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "DELETE FROM gamecollection WHERE _id="

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/digdroid/alman/dig/m0$d$a;->c:Lcom/digdroid/alman/dig/m0$d;

    iget-object v0, v0, Lcom/digdroid/alman/dig/m0$d;->b:[J

    iget v1, p0, Lcom/digdroid/alman/dig/m0$d$a;->b:I

    aget-wide v1, v0, v1

    invoke-virtual {p2, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/m0$d$a;->c:Lcom/digdroid/alman/dig/m0$d;

    iget-object p1, p1, Lcom/digdroid/alman/dig/m0$d;->c:Lcom/digdroid/alman/dig/m0;

    iget-object p1, p1, Lcom/digdroid/alman/dig/m0;->d:Lcom/digdroid/alman/dig/m0$p;

    invoke-interface {p1}, Lcom/digdroid/alman/dig/m0$p;->b()V

    return-void
.end method
