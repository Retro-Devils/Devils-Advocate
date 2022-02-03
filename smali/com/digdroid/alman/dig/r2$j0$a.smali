.class Lcom/digdroid/alman/dig/r2$j0$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/digdroid/alman/dig/i$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/r2$j0;->onClick(Landroid/content/DialogInterface;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/digdroid/alman/dig/r2$j0;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/r2$j0;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/r2$j0$a;->a:Lcom/digdroid/alman/dig/r2$j0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a([Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, Lcom/digdroid/alman/dig/r2$j0$a;->a:Lcom/digdroid/alman/dig/r2$j0;

    iget-object v0, v0, Lcom/digdroid/alman/dig/r2$j0;->c:Lcom/digdroid/alman/dig/r2;

    iget-object v0, v0, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/c3;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "storage_dir"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/digdroid/alman/dig/r2$j0$a;->a:Lcom/digdroid/alman/dig/r2$j0;

    iget v2, v2, Lcom/digdroid/alman/dig/r2$j0;->b:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aget-object p1, p1, v2

    invoke-virtual {v0, v1, p1}, Lcom/digdroid/alman/dig/c3;->z(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/r2$j0$a;->a:Lcom/digdroid/alman/dig/r2$j0;

    iget-object v0, p1, Lcom/digdroid/alman/dig/r2$j0;->c:Lcom/digdroid/alman/dig/r2;

    iget-object v0, v0, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/c3;

    iget p1, p1, Lcom/digdroid/alman/dig/r2$j0;->b:I

    add-int/lit8 p1, p1, 0x1

    const-string v1, "num_storage_dirs"

    invoke-virtual {v0, v1, p1}, Lcom/digdroid/alman/dig/c3;->x(Ljava/lang/String;I)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/r2$j0$a;->a:Lcom/digdroid/alman/dig/r2$j0;

    iget-object p1, p1, Lcom/digdroid/alman/dig/r2$j0;->c:Lcom/digdroid/alman/dig/r2;

    invoke-virtual {p1}, Lcom/digdroid/alman/dig/r2;->A3()V

    return-void
.end method
