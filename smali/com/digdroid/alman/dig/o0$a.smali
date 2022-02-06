.class Lcom/digdroid/alman/dig/o0$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/o0;->i(Lcom/digdroid/alman/dig/y3;JLcom/digdroid/alman/dig/h0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Ljava/util/ArrayList;

.field final synthetic c:Landroid/database/Cursor;

.field final synthetic d:Lcom/digdroid/alman/dig/y3;

.field final synthetic e:Lcom/digdroid/alman/dig/o0;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/o0;Ljava/util/ArrayList;Landroid/database/Cursor;Lcom/digdroid/alman/dig/y3;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/o0$a;->e:Lcom/digdroid/alman/dig/o0;

    iput-object p2, p0, Lcom/digdroid/alman/dig/o0$a;->b:Ljava/util/ArrayList;

    iput-object p3, p0, Lcom/digdroid/alman/dig/o0$a;->c:Landroid/database/Cursor;

    iput-object p4, p0, Lcom/digdroid/alman/dig/o0$a;->d:Lcom/digdroid/alman/dig/y3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    iget-object p1, p0, Lcom/digdroid/alman/dig/o0$a;->b:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    const/4 v0, 0x0

    if-lt p2, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iget-object v1, p0, Lcom/digdroid/alman/dig/o0$a;->c:Landroid/database/Cursor;

    if-eqz p1, :cond_1

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lcom/digdroid/alman/dig/o0$a;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v0

    :goto_1
    invoke-interface {v1, v0}, Landroid/database/Cursor;->moveToPosition(I)Z

    iget-object p2, p0, Lcom/digdroid/alman/dig/o0$a;->e:Lcom/digdroid/alman/dig/o0;

    iget-object v0, p0, Lcom/digdroid/alman/dig/o0$a;->d:Lcom/digdroid/alman/dig/y3;

    iget-object v1, p0, Lcom/digdroid/alman/dig/o0$a;->c:Landroid/database/Cursor;

    invoke-virtual {p2, v0, v1, p1}, Lcom/digdroid/alman/dig/o0;->j(Lcom/digdroid/alman/dig/y3;Landroid/database/Cursor;Z)V

    return-void
.end method
