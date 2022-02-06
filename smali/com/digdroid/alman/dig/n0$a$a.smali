.class Lcom/digdroid/alman/dig/n0$a$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/n0$a;->onClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:[I

.field final synthetic c:Lcom/digdroid/alman/dig/n0$a;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/n0$a;[I)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/n0$a$a;->c:Lcom/digdroid/alman/dig/n0$a;

    iput-object p2, p0, Lcom/digdroid/alman/dig/n0$a$a;->b:[I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    iget-object p1, p0, Lcom/digdroid/alman/dig/n0$a$a;->b:[I

    aget p1, p1, p2

    iget-object p2, p0, Lcom/digdroid/alman/dig/n0$a$a;->c:Lcom/digdroid/alman/dig/n0$a;

    iget-object v0, p2, Lcom/digdroid/alman/dig/n0$a;->f:Lcom/digdroid/alman/dig/n0;

    iget-object v1, p2, Lcom/digdroid/alman/dig/n0$a;->c:Landroid/widget/TextView;

    iget-object p2, p2, Lcom/digdroid/alman/dig/n0$a;->b:Ljava/lang/String;

    invoke-virtual {v0, v1, p2, p1}, Lcom/digdroid/alman/dig/n0;->h3(Landroid/widget/TextView;Ljava/lang/String;I)V

    iget-object p2, p0, Lcom/digdroid/alman/dig/n0$a$a;->c:Lcom/digdroid/alman/dig/n0$a;

    iget-object v0, p2, Lcom/digdroid/alman/dig/n0$a;->f:Lcom/digdroid/alman/dig/n0;

    iget-object v0, v0, Lcom/digdroid/alman/dig/n0;->p0:Ljava/util/HashMap;

    iget p2, p2, Lcom/digdroid/alman/dig/n0$a;->d:I

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, p2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p2, p0, Lcom/digdroid/alman/dig/n0$a$a;->c:Lcom/digdroid/alman/dig/n0$a;

    iget-object v0, p2, Lcom/digdroid/alman/dig/n0$a;->f:Lcom/digdroid/alman/dig/n0;

    iget-object v0, v0, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/b3;

    iget-object p2, p2, Lcom/digdroid/alman/dig/n0$a;->e:Ljava/lang/String;

    invoke-virtual {v0, p2, p1}, Lcom/digdroid/alman/dig/b3;->E(Ljava/lang/String;I)V

    iget-object p2, p0, Lcom/digdroid/alman/dig/n0$a$a;->c:Lcom/digdroid/alman/dig/n0$a;

    iget v0, p2, Lcom/digdroid/alman/dig/n0$a;->d:I

    const/16 v1, 0x6d

    if-ne v0, v1, :cond_0

    iget-object p2, p2, Lcom/digdroid/alman/dig/n0$a;->f:Lcom/digdroid/alman/dig/n0;

    iget-object p2, p2, Lcom/digdroid/alman/dig/n0;->p0:Ljava/util/HashMap;

    const/4 v0, 0x4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p2, v0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method
