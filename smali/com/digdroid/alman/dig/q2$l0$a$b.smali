.class Lcom/digdroid/alman/dig/q2$l0$a$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/q2$l0$a;->onClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/digdroid/alman/dig/q2$l0$a;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/q2$l0$a;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/q2$l0$a$b;->b:Lcom/digdroid/alman/dig/q2$l0$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    iget-object p1, p0, Lcom/digdroid/alman/dig/q2$l0$a$b;->b:Lcom/digdroid/alman/dig/q2$l0$a;

    iget-object p1, p1, Lcom/digdroid/alman/dig/q2$l0$a;->b:Lcom/digdroid/alman/dig/q2$l0;

    iget-object p1, p1, Lcom/digdroid/alman/dig/q2$l0;->a:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    return-void
.end method
