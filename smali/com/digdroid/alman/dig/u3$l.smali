.class Lcom/digdroid/alman/dig/u3$l;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/u3;->v1()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/digdroid/alman/dig/p1;

.field final synthetic c:Lcom/digdroid/alman/dig/u3;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/u3;Lcom/digdroid/alman/dig/p1;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/u3$l;->c:Lcom/digdroid/alman/dig/u3;

    iput-object p2, p0, Lcom/digdroid/alman/dig/u3$l;->b:Lcom/digdroid/alman/dig/p1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    iget-object p1, p0, Lcom/digdroid/alman/dig/u3$l;->b:Lcom/digdroid/alman/dig/p1;

    invoke-virtual {p1}, Lcom/digdroid/alman/dig/p1;->O2()V

    return-void
.end method
