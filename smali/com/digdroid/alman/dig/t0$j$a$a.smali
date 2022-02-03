.class Lcom/digdroid/alman/dig/t0$j$a$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/digdroid/alman/dig/m0$o;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/t0$j$a;->onClick(Landroid/content/DialogInterface;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/digdroid/alman/dig/t0$j$a;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/t0$j$a;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/t0$j$a$a;->a:Lcom/digdroid/alman/dig/t0$j$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(J)V
    .locals 2

    new-instance v0, Lcom/digdroid/alman/dig/t0$j$a$a$a;

    invoke-direct {v0, p0, p1, p2}, Lcom/digdroid/alman/dig/t0$j$a$a$a;-><init>(Lcom/digdroid/alman/dig/t0$j$a$a;J)V

    const/4 p1, 0x1

    new-array p1, p1, [Landroid/database/Cursor;

    iget-object p2, p0, Lcom/digdroid/alman/dig/t0$j$a$a;->a:Lcom/digdroid/alman/dig/t0$j$a;

    iget-object p2, p2, Lcom/digdroid/alman/dig/t0$j$a;->d:Lcom/digdroid/alman/dig/t0$j;

    iget-object p2, p2, Lcom/digdroid/alman/dig/t0$j;->a:Lcom/digdroid/alman/dig/t0;

    invoke-virtual {p2}, Lcom/digdroid/alman/dig/t0;->k3()Landroid/database/Cursor;

    move-result-object p2

    const/4 v1, 0x0

    aput-object p2, p1, v1

    invoke-virtual {v0, p1}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    return-void
.end method
